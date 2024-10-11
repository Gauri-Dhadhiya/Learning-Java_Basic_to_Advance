package com.example.walmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon.bean.DealItem;
import com.example.walmart.bean.WalmartServerResponse;
import com.example.walmart.service.WalmartService;
import java.util.List;

@RestController
public class WalmartController {

	@Autowired
	private WalmartService walmartService;

	@GetMapping("/walmart/deals/{categoryName}")
	public WalmartServerResponse getWalmartDeals(@PathVariable String categoryName) {
		List<DealItem> walmartDealData = walmartService.getWalmartServerDeals(categoryName);
		return new WalmartServerResponse(categoryName, walmartDealData);
	}
}
