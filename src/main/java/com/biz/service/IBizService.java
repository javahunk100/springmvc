package com.biz.service;

import java.util.List;

import com.library.web.controller.model.BookForm;

public interface IBizService {

	public String addBook(BookForm bookForm);
	public List<BookForm>  findAllBooks();
	public String deleteBookByBid(int bid);
	public BookForm findBookByBid(int bid);
	public String updateBook(BookForm bookForm);

}
