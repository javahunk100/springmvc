package com.biz.service.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.dao.entity.BookEntity;
import com.biz.service.BizService;

public class BizServiceSpringMain {
		
	  public static void main(String[] args) {
		  //Creating spring container which will read our xml file present inside the classpath
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-application-context.xml");
		 BizService bizService=(BizService)applicationContext.getBean("bizService");
		 BookEntity bookEntity=new BookEntity();
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the author name..");
		 String author=scanner.next();
		 
		 System.out.println("Enter the book name..");
		 String name=scanner.next();
		 
		 bookEntity.setAuthor(author);
		 bookEntity.setName(name);
		 bookEntity.setPrice(90);
		 bookEntity.setPublication("TMH publications");
		 String result=bizService.addBook(bookEntity);
		 
		 System.out.println("_@#_#_#_#Result - "+result);
		 List<BookEntity> bookEntities=bizService.findAllBooks();
		 for(BookEntity  entity:bookEntities){
			 System.out.println(entity);
		 }
	  }
	
}
