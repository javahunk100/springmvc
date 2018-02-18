package com.biz.dao;

import java.util.List;

import com.biz.dao.entity.BookEntity;

public interface IBizDao {

	public List<BookEntity> findBooks();
	public String addBook(BookEntity book);
	public String deleteBookByBid(int bid);
	public BookEntity findBookByBid(int bid);
	public String updateBook(BookEntity book);

}
