package com.example.ebay.service;

import java.util.*;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazon.bean.DealItem;
import com.example.amazon.exception.InvalidCategoryNameException;
import com.example.ebay.repository.EbayRepository;

@Service
public class EbayService {

	@Autowired
	private EbayRepository ebayRepository;

	public List<DealItem> getEbayServerDeals(String CategoryName) throws InterruptedException, ExecutionException {
		validateCategoryName(CategoryName);  
		return ebayRepository.getEbayServerData(CategoryName);
	}
	
	private void validateCategoryName(String CategoryName) {
		String validCategoryName = "Jeans";
		if (!validCategoryName.equalsIgnoreCase(CategoryName)) {
			throw new InvalidCategoryNameException("Invalid categoryName: " + CategoryName);
		}
	}
}
