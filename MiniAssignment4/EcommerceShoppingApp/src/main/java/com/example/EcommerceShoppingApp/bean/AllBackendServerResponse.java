package com.example.EcommerceShoppingApp.bean;

import com.example.amazon.bean.DealItem;
import java.util.List;

public class AllBackendServerResponse {
	private String categoryName;
	private List<DealItem> ebayServerData;
	private List<DealItem> amazonServerData;
	private List<DealItem> walmartServerData;

	// Getters and Setters
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<DealItem> getEbayServerData() {
		return ebayServerData;
	}

	public void setEbayServerData(List<DealItem> ebayServerData) {
		this.ebayServerData = ebayServerData;
	}

	public List<DealItem> getAmazonServerData() {
		return amazonServerData;
	}

	public void setAmazonServerData(List<DealItem> amazonServerData) {
		this.amazonServerData = amazonServerData;
	}

	public List<DealItem> getWalmartServerData() {
		return walmartServerData;
	}

	public void setWalmartServerData(List<DealItem> walmartServerData) {
		this.walmartServerData = walmartServerData;
	}
}
