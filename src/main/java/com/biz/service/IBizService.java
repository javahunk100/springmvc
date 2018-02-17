package com.biz.service;

import java.util.List;

import com.library.web.controller.model.BookForm;

public interface IBizService {

	public String addBook(BookForm bookForm);
	public List<BookForm>  findAllBooks();

}
