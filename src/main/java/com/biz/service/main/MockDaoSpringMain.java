package com.biz.service.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.dao.MockDao;
import com.biz.dao.entity.BookEntity;
import com.biz.service.BizService;

public class MockDaoSpringMain {
		
	  public static void main(String[] args) {
		  //Creating spring container which will read our xml file present inside the classpath
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mock-dao.xml");
		 MockDao mockDao=(MockDao)applicationContext.getBean("MockDao");
		 mockDao.show();
	  }
	
}
