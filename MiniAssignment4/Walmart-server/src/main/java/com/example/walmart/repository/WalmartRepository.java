package com.example.walmart.repository;

import java.time.ZonedDateTime;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.example.amazon.bean.DealItem;
import com.example.amazon.bean.PriceDetail;

@Repository
public class WalmartRepository {

	public List<DealItem> getWalmartServerData(String categoryName) {
		return Arrays.asList(
				new DealItem("323456789", "Blue Levi's Jeans", "30", "Levi's", "https://example.com/images/levis.jpg",
						new PriceDetail(34.99, "USD", 15.0, 5.25, "LIST_PRICE", 29.74, "USD"), 0,
						ZonedDateTime.parse("2022-06-20T15:26:00Z"), ZonedDateTime.parse("2026-09-29T14:59:59Z")),
				new DealItem("981235680", "Black Men Slim Fit Mid Rise Jeans", "32", "Calvin Klein Jeans",
						"https://example.com/images/calvin.jpg",
						new PriceDetail(49.99, "USD", 20.0, 10.0, "LIST_PRICE", 39.99, "USD"), 1,
						ZonedDateTime.parse("2023-06-20T15:26:00Z"), ZonedDateTime.parse("2029-11-30T14:59:59Z")));

	}
}
