package com.spring.model;

public class Engine {
	private int price;
	private String eid;
	private String model;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [price=" + price + ", eid=" + eid + ", model=" + model + "]";
	}

}
