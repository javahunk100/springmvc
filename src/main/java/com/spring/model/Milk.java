package com.spring.model;

public class Milk {
	private String brand;
	private int quantity;
	private float price;
	
	public Milk(){
	}
	
	public Milk(String brand, int quantity, float price) {
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Milk [brand=" + brand + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
