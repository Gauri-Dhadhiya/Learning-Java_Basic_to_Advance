package com.example.mainapplication.service;

import com.example.mainapplication.Exceptions.InvalidStatusException;
import com.example.mainapplication.model.BackendServerResponse;
import com.example.mainapplication.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public CompletableFuture<List<Transaction>> getTransactions(String accountNumber, String status) {
        validateStatus(status);

        if ("ALL".equalsIgnoreCase(status)) {
            CompletableFuture<BackendServerResponse> successFuture = fetchTransactions("success", accountNumber);
            CompletableFuture<BackendServerResponse> failureFuture = fetchTransactions("failure", accountNumber);
            CompletableFuture<BackendServerResponse> pendingFuture = fetchTransactions("pending", accountNumber);

            return CompletableFuture.allOf(successFuture, failureFuture, pendingFuture)
                    .thenApply(v -> combineResults(List.of(successFuture.join(), failureFuture.join(), pendingFuture.join())));
        } else {
            return fetchTransactions(status, accountNumber)
                    .thenApply(response -> combineResults(List.of(response)));
        }
    }

    private void validateStatus(String status) {
        List<String> validStatuses = List.of("all", "success", "pending", "failure");
        if (!validStatuses.contains(status.toLowerCase())) {
            throw new InvalidStatusException("Invalid status: " + status);
        }
    }

    private CompletableFuture<BackendServerResponse> fetchTransactions(String status, String accountNumber) {
        String baseUrl = determineBaseUrl(status);
        String url = baseUrl + accountNumber;

        return webClientBuilder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(BackendServerResponse.class)
                .toFuture();
    }

    private String determineBaseUrl(String status) {
        switch (status.toLowerCase()) {
            case "success":
                return "http://localhost:8081/backendserver1/success/";
            case "failure":
                return "http://localhost:8082/backendserver2/failure/";
            case "pending":
                return "http://localhost:8083/backendserver3/pending/";
            default:
                return ""; // Empty URL for "ALL" status
        }
    }


    private List<Transaction> combineResults(List<BackendServerResponse> responses) {
        return responses.stream()
                .flatMap(response -> {
                    List<Transaction> transactions = new ArrayList<>();
                    if (response != null) {
                        if (response.getSuccess() != null) {
                            transactions.addAll(response.getSuccess());
                        }
                        if (response.getFailure() != null) {
                            transactions.addAll(response.getFailure());
                        }
                        if (response.getPending() != null) {
                            transactions.addAll(response.getPending());
                        }
                    }
                    return transactions.stream();
                })
                .collect(Collectors.toList());
    }

}