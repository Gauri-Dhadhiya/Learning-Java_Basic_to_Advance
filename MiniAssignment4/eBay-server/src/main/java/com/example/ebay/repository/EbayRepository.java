package com.example.ebay.repository;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.amazon.bean.DealItem;
import com.example.amazon.bean.PriceDetail;

@Repository
public class EbayRepository {

	public List<DealItem> getEbayServerData(String CategoryName) {
		return Arrays.asList(
				new DealItem("223456789", "Blue Wrangler Jeans", "35", "Wrangler",
						"https://example.com/images/wrangler.jpg",
						new PriceDetail(19.99, "USD", 10.0, 4.0, "LIST_PRICE", 12.99, "USD"), 5,
						ZonedDateTime.parse("2022-06-20T15:26:00Z"), ZonedDateTime.parse("2028-05-24T14:59:59Z")),
				new DealItem("223456788", "Blue Wrangler Women Jeans", "32", "Wrangler",
						"https://example.com/images/wrangler.jpg",
						new PriceDetail(76.97, "USD", 11.0, 14.0, "LIST_PRICE", 38.99, "USD"), 11,
						ZonedDateTime.parse("2023-06-21T15:26:00Z"), ZonedDateTime.parse("2026-11-21T14:59:59Z")),
				new DealItem("981235679", "Black Men Slim Fit Mid Rise Jeans", "32", "Lee Jeans",
						"https://example.com/images/lee.jpg",
						new PriceDetail(29.99, "USD", 40.0, 12.99, "LIST_PRICE", 17.99, "USD"), 2,
						ZonedDateTime.parse("2024-04-20T15:26:00Z"), ZonedDateTime.parse("2028-10-24T14:59:59Z")));
	}
}
