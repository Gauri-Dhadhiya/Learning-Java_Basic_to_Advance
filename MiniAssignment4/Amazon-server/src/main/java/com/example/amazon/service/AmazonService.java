package com.example.amazon.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazon.bean.DealItem;
import com.example.amazon.exception.InvalidCategoryNameException;
import com.example.amazon.repository.AmazonRepo;

@Service
public class AmazonService {

	@Autowired
	private AmazonRepo amazonRepository;

	public List<DealItem> getAmazonServerDeals(String categoryName)throws InterruptedException, ExecutionException {
		validateCategoryName(categoryName); 
		return amazonRepository.getAmazonServerData(categoryName);
	}
		private void validateCategoryName(String categoryName) {
			String validCategoryName = "Jeans";
			if (!validCategoryName.equalsIgnoreCase(categoryName)) {
				throw new InvalidCategoryNameException("Invalid categoryName: " + categoryName);
			}
		}
}
