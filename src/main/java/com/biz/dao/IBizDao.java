package com.biz.dao;

import java.util.List;

import com.biz.dao.entity.BookEntity;

public interface IBizDao {

	public List<BookEntity> findBooks();
	public String addBook(BookEntity book);

}
