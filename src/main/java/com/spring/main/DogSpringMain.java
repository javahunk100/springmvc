package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;

public class DogSpringMain {
	public static void main(String[] args) {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dogs.xml");
		Dog  dog=(Dog)applicationContext.getBean("pdog");
		dog.bark();
		System.out.println(dog);
		
		Dog  dog1=(Dog)applicationContext.getBean("pdog1");
		dog1.bark();
		System.out.println(dog1);
		
		
		Dog  dog2=(Dog)applicationContext.getBean("pdog2");
		dog2.bark();
		System.out.println(dog2);
	}
}
