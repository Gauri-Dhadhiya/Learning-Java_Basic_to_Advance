package com.example.amazon.bean;

import java.util.List;


public class AmazonServerResponse {

	private String categoryName;
    private List<DealItem> amazonServerData;
	
    public AmazonServerResponse(String categoryName, List<DealItem> amazonServerData) {
		super();
		this.categoryName = categoryName;
		this.amazonServerData = amazonServerData;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<DealItem> getAmazonServerData() {
		return amazonServerData;
	}

	public void setAmazonServerData(List<DealItem> amazonServerData) {
		this.amazonServerData = amazonServerData;
	}
    
    
}
