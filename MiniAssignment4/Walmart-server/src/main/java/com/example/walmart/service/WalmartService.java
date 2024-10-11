package com.example.walmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.amazon.bean.DealItem;
import com.example.walmart.repository.WalmartRepository;

@Service
public class WalmartService {

	@Autowired
	private WalmartRepository walmartRepository;

	public List<DealItem> getWalmartServerDeals(String categoryName) {
		return walmartRepository.getWalmartServerData(categoryName);
	}
}
