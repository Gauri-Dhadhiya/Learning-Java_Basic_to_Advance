package com.example.amazon.repository;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.amazon.bean.DealItem;
import com.example.amazon.bean.PriceDetail;

@Repository
public class AmazonRepo {
	public List<DealItem> getAmazonServerData(String categoryName) {
		return Arrays.asList(
				new DealItem("123456789", "Blue Levis Jeans", "30", "Levis", "https://example.com/images/levis.jpg",
						new PriceDetail(29.99, "USD", 34.0, 5.0, "LIST_PRICE", 24.99, "USD"), 4,
						ZonedDateTime.parse("2024-03-23T15:26:00Z"), ZonedDateTime.parse("2026-06-11T14:59:59Z")),
				new DealItem("981235678", "Black Men Slim Fit Mid Rise Jeans", "32", "Louis Philippe Jeans",
						"https://example.com/images/louis.jpg",
						new PriceDetail(29.99, "USD", 10.0, 14.99, "LIST_PRICE", 14.99, "USD"), 3,
						ZonedDateTime.parse("2023-06-20T15:26:00Z"), ZonedDateTime.parse("2029-12-24T14:59:59Z")),
				new DealItem("981235677", "Black WomMen Mom fit Jeans", "28", "Levis Jeans",
						"https://example.com/images/levis.jpg",
						new PriceDetail(88.99, "USD", 46.0, 05.99, "LIST_PRICE", 05.99, "USD"), 0,
						ZonedDateTime.parse("2024-05-20T15:26:00Z"), ZonedDateTime.parse("2025-12-20T14:59:59Z")));
	}
}
