package com.spring.model;

public class Tyres {
	private int not;
	private String vendor;
	private int price;

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tyres [not=" + not + ", vendor=" + vendor + ", price=" + price + "]";
	}

}
