package com.example.amazon.bean;

import java.time.ZonedDateTime;

public class DealItem {

	private String itemId;
	private String productTitle;
	private String size;
	private String brand;
	private String imageUrl;

	private PriceDetail priceDetail;
	private int stock;
	private ZonedDateTime dealStartDate;
	private ZonedDateTime dealEndDate;

	public DealItem(String itemId, String productTitle, String size, String brand, String imageUrl,
			PriceDetail priceDetail, int stock, ZonedDateTime dealStartDate, ZonedDateTime dealEndDate) {
		super();
		this.itemId = itemId;
		this.productTitle = productTitle;
		this.size = size;
		this.brand = brand;
		this.imageUrl = imageUrl;
		this.priceDetail = priceDetail;
		this.stock = stock;
		this.dealStartDate = dealStartDate;
		this.dealEndDate = dealEndDate;
	}

	public DealItem() {
		super();
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public PriceDetail getPriceDetail() {
		return priceDetail;
	}

	public void setPriceDetail(PriceDetail priceDetail) {
		this.priceDetail = priceDetail;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public ZonedDateTime getDealStartDate() {
		return dealStartDate;
	}

	public void setDealStartDate(ZonedDateTime dealStartDate) {
		this.dealStartDate = dealStartDate;
	}

	public ZonedDateTime getDealEndDate() {
		return dealEndDate;
	}

	public void setDealEndDate(ZonedDateTime dealEndDate) {
		this.dealEndDate = dealEndDate;
	}

}
