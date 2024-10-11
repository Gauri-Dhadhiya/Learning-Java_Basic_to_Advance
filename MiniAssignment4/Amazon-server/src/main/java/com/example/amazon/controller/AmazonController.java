package com.example.amazon.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon.bean.AmazonServerResponse;
import com.example.amazon.bean.DealItem;
import com.example.amazon.service.AmazonService;

@RestController
public class AmazonController {

	@Autowired
	private AmazonService amazonService;

	@GetMapping("/amazon/deals/{categoryName}")
	public AmazonServerResponse getAmazonServerDeals(@PathVariable String categoryName) throws ExecutionException, InterruptedException {
		List<DealItem> amazonServerDeals = amazonService.getAmazonServerDeals(categoryName);
		return new AmazonServerResponse(categoryName, amazonServerDeals);
	}
}
