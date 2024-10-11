package com.example.EcommerceShoppingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.EcommerceShoppingApp.bean.AllBackendServerResponse;
import com.example.EcommerceShoppingApp.exceptions.InvalidCategoryNameException;
import com.example.EcommerceShoppingApp.exceptions.ServerDownException;
import com.example.amazon.bean.DealItem;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class DealService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	private static final Logger logger = Logger.getLogger(DealService.class.getName());

	public CompletableFuture<List<DealItem>> getDeals(String categoryName)
			throws InterruptedException, ExecutionException {
		validateCategoryName(categoryName);

		CompletableFuture<AllBackendServerResponse> amazonDeals = getDealsFromAmazon(categoryName).exceptionally(ex -> {
			throw new ServerDownException("Amazon server is down");
		});
		CompletableFuture<AllBackendServerResponse> ebayDeals = getDealsFromEbay(categoryName).exceptionally(ex -> {
			throw new ServerDownException("Ebay server is down");
		});
		CompletableFuture<AllBackendServerResponse> walmartDeals = getDealsFromWalmart(categoryName)
				.exceptionally(ex -> {
					throw new ServerDownException("Walmart server is down");
				});

		return CompletableFuture.allOf(amazonDeals, ebayDeals, walmartDeals).thenApply(v -> {
			List<AllBackendServerResponse> responses = List.of(getResult(amazonDeals), getResult(ebayDeals),
					getResult(walmartDeals));
			return combineResults(responses);
		});
	}

	private void validateCategoryName(String categoryName) {
		String validCategoryName = "Jeans";
		if (!validCategoryName.equalsIgnoreCase(categoryName)) {
			throw new InvalidCategoryNameException("Invalid categoryName: " + categoryName);
		}
	}

	private CompletableFuture<AllBackendServerResponse> getDealsFromAmazon(String categoryName) {
		return webClientBuilder.build().get().uri("http://localhost:8081/amazon/deals/" + categoryName).retrieve()
				.bodyToMono(AllBackendServerResponse.class).toFuture();
	}

	private CompletableFuture<AllBackendServerResponse> getDealsFromEbay(String categoryName) {
		return webClientBuilder.build().get().uri("http://localhost:8082/ebay/deals/" + categoryName).retrieve()
				.bodyToMono(AllBackendServerResponse.class).toFuture();
	}

	private CompletableFuture<AllBackendServerResponse> getDealsFromWalmart(String categoryName) {
		return webClientBuilder.build().get().uri("http://localhost:8083/walmart/deals/" + categoryName).retrieve()
				.bodyToMono(AllBackendServerResponse.class).toFuture();
//				.doOnNext(response -> logger.info("Walmart response received: " + response))
//				.doOnError(error -> logger.severe("Error fetching Walmart deals: " + error.getMessage())).toFuture();
	}

	private List<DealItem> combineResults(List<AllBackendServerResponse> responses) {
		ZonedDateTime currentDate = ZonedDateTime.now();
		return responses.stream().flatMap(response -> {
			List<DealItem> transactions = new ArrayList<>();
			if (response != null) {
				if (response.getAmazonServerData() != null) {
					transactions.addAll(response.getAmazonServerData());
				}
				if (response.getEbayServerData() != null) {
					transactions.addAll(response.getEbayServerData());
				}
				if (response.getWalmartServerData() != null) {
					transactions.addAll(response.getWalmartServerData());
				}
			}
			return transactions.stream();
		}).filter(dealItem -> dealItem.getStock() > 0).filter(dealItem -> isDealActive(dealItem, currentDate))
//				.peek(dealItem -> logger.info("After date filter: " + dealItem))
				.sorted(Comparator
						.comparingDouble((DealItem dealItem) -> dealItem.getPriceDetail().getDiscountPercentage())
						.reversed().thenComparingDouble(dealItem -> dealItem.getPriceDetail().getPrice()))
				.collect(Collectors.toList());
	}

	private boolean isDealActive(DealItem dealItem, ZonedDateTime currentDate) {
		return (currentDate.isAfter(dealItem.getDealStartDate()) || currentDate.isEqual(dealItem.getDealStartDate()))
				&& (currentDate.isBefore(dealItem.getDealEndDate()) || currentDate.isEqual(dealItem.getDealEndDate()));
	}

	private AllBackendServerResponse getResult(CompletableFuture<AllBackendServerResponse> future) {
		try {
			return future.get();
		} catch (InterruptedException | ExecutionException e) {
			throw new ServerDownException("A server is down: " + e.getMessage());
		}
	}

}
