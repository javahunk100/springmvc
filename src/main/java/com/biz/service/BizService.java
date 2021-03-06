
package com.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.biz.dao.BizDao;
import com.biz.dao.entity.BookEntity;
import com.library.web.controller.model.BookForm;

@Service("BizService")
public class BizService  implements IBizService{
	
	@Autowired
	@Qualifier("BizDao")
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
	
	@Override
	public List<String> findPublications(){
		return bizDao.findPublications();
	}

	@Override
	public byte[] findBookPhtotByBid(int bid){
		return bizDao.findBookPhtotByBid(bid);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addBook(BookForm bookForm){
		    boolean b=TransactionSynchronizationManager.isActualTransactionActive();
			if(b){
				System.out.println(")######################################TX is working #############");;
			}
		    BookEntity bookEntity=new BookEntity();
			BeanUtils.copyProperties(bookForm, bookEntity);
			  String result=bizDao.addBook(bookEntity);
			  result=bizDao.addBook(bookEntity); //Runtime Exception comes then transaction will be roleback
			  result=bizDao.addBook(bookEntity);
			  result=bizDao.addBook(bookEntity);
			  result=bizDao.addBook(bookEntity);
			return result;	
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String updateBook(BookForm bookForm){
			BookEntity bookEntity=new BookEntity();
			BeanUtils.copyProperties(bookForm, bookEntity);
			String  result=bizDao.updateBook(bookEntity);
			return result;	
	}	

	
	@Override
	public List<BookForm>  findAllBooks(){
		List<BookEntity> bookEntities=bizDao.findBooks();
		List<BookForm> bookForms=new ArrayList<>();
		for(BookEntity entity:bookEntities){
			BookForm bookForm=new BookForm();
			BeanUtils.copyProperties(entity, bookForm);
			bookForms.add(bookForm);
		}
		return bookForms;	
}	

	public void show(){
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		System.out.println("_@_@_@_@hmmmmm");
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String deleteBookByBid(int bid) {
		return bizDao.deleteBookByBid(bid);
	}

	@Override
	public BookForm findBookByBid(int bid) {
		BookEntity bookEntity=bizDao.findBookByBid(bid);
		BookForm bookForm=new BookForm();
		BeanUtils.copyProperties(bookEntity, bookForm);
		return bookForm;
	}
	
}
