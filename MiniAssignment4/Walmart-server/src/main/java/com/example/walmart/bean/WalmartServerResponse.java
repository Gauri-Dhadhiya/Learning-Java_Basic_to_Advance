package com.example.walmart.bean;

import java.util.List;
import com.example.amazon.bean.DealItem;

public class WalmartServerResponse {

	private String categoryName;
	private List<DealItem> walmartServerData;
	
	public WalmartServerResponse(String categoryName, List<DealItem> walmartServerData) {
		super();
		this.categoryName = categoryName;
		this.walmartServerData = walmartServerData;
	}

	public WalmartServerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<DealItem> getWalmartServerData() {
		return walmartServerData;
	}

	public void setWalmartServerData(List<DealItem> walmartServerData) {
		this.walmartServerData = walmartServerData;
	}

	

}
