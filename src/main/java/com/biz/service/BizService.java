
package com.biz.service;

import java.util.List;

import com.biz.dao.BizDao;
import com.biz.dao.entity.BookEntity;

public class BizService {
	
	private BizDao bizDao;
	
	private String sname;
	
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}



	/**
	 * @return the bizDao
	 */
	public BizDao getBizDao() {
		return bizDao;
	}

	/**
	 * @param bizDao the bizDao to set
	 */
	public void setBizDao(BizDao bizDao) {
		this.bizDao = bizDao;
	}

	public String addBook(BookEntity bookEntity){
			String  result=bizDao.addBook(bookEntity);
			return result;	
	}	
	
	public List<BookEntity>  findAllBooks(){
		List<BookEntity> bookEntities=bizDao.findBooks();
		return bookEntities;	
}	

	public void show(){
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		
	}
	
}
