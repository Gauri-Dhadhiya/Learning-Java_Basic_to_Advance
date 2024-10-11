package com.example.ebay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.amazon.bean.DealItem;
import com.example.ebay.bean.EbayServerResponse;
import com.example.ebay.service.EbayService;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class eBayController {

	@Autowired
	private EbayService ebayService;

	@GetMapping("/ebay/deals/{categoryName}")
	public EbayServerResponse getEbayDeals(@PathVariable String categoryName)throws InterruptedException, ExecutionException {
		List<DealItem> ebayDealsData = ebayService.getEbayServerDeals(categoryName);
		return new EbayServerResponse(categoryName, ebayDealsData);
	}
}
