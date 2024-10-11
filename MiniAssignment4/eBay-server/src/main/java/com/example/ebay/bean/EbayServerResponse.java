package com.example.ebay.bean;

import java.util.List;

import com.example.amazon.bean.DealItem;

public class EbayServerResponse {

	private String categoryName;
	private List<DealItem> ebayServerData;

	public EbayServerResponse(String categoryName, List<DealItem> ebayServerData) {
		super();
		this.categoryName = categoryName;
		this.ebayServerData = ebayServerData;
	}

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

}
