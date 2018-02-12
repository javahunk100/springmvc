package com.biz.service.main;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeDataSource {
		
	  public static void main(String[] args) {
		  //Creating spring container which will read our xml file present inside the classpath
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("prototype-service.xml");
		 	DataSource dataSource1=(DataSource)applicationContext.getBean("dbcpDataSource");
		 	DataSource dataSource2=(DataSource)applicationContext.getBean("dbcpDataSource");
		 	DataSource dataSource3=(DataSource)applicationContext.getBean("dbcpDataSource");
		 	if(dataSource1!=dataSource2){
		 		System.out.println("_@)@)@)true___");
		 	}
		 	if(dataSource2!=dataSource3){
		 		System.out.println("_@)@)@)true___");
		 	}
	  }
	
}
