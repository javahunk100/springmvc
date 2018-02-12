package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;
import com.spring.model.Milk;
import com.spring.model.Mobile;

public class MethodLookupMobileTimeMain {
	public static void main(String[] args) throws InterruptedException {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("method-lookup-mobile-time.xml");
		Mobile  dog=(Mobile)applicationContext.getBean("mobile");
		System.out.println(dog.getTimeInstance());
		
		Thread.sleep(4000);
		System.out.println(dog.getTimeInstance());
		
		Thread.sleep(4000);
		System.out.println(dog.getTimeInstance());
		
		Thread.sleep(4000);
		System.out.println(dog.getTimeInstance());
		
		System.out.println("_@(@&@%#*I am done!_#(*#*#");
	}
}
