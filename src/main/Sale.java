package main;

public class Sale {
	
	public Products productType;
	public double price;
	
	public Sale(Products prodType, int price) {
		this.productType = prodType;
		this.price = price;
	}
	
	public Sale() {};
	
	public Products getProductType() {
		return productType;
	}
	
	public void setProductType(Products productType) {
		this.productType = productType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
