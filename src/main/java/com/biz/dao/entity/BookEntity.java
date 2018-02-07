package com.biz.dao.entity;

import java.sql.Timestamp;

public class BookEntity {
	private int bid;
	private String name;
	private String author;
	private String publication;
	private int price;
	private Timestamp doe;
	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}
	/**
	 * @param publication the publication to set
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the doe
	 */
	public Timestamp getDoe() {
		return doe;
	}
	/**
	 * @param doe the doe to set
	 */
	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}
	@Override
	public String toString() {
		return "BookEntity [bid=" + bid + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", price=" + price + ", doe=" + doe + "]";
	}

	
}
