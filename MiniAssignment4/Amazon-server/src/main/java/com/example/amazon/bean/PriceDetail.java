package com.example.amazon.bean;

public class PriceDetail {
	
	 
    private double originalPrice;
    private String currency;
    private double discountPercentage;
    private double discountAmount;
    private String priceTreatment;
    private double price;
    private String priceCurrency;
    
	public PriceDetail(double originalPrice, String currency, double discountPercentage, double discountAmount,
			String priceTreatment, double price, String priceCurrency) {
		super();
		this.originalPrice = originalPrice;
		this.currency = currency;
		this.discountPercentage = discountPercentage;
		this.discountAmount = discountAmount;
		this.priceTreatment = priceTreatment;
		this.price = price;
		this.priceCurrency = priceCurrency;
	}
	
	

	public PriceDetail() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getPriceTreatment() {
		return priceTreatment;
	}

	public void setPriceTreatment(String priceTreatment) {
		this.priceTreatment = priceTreatment;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
	
}
