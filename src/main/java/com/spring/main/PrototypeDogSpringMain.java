package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;

public class PrototypeDogSpringMain {
	public static void main(String[] args) {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("prototype-dogs.xml");
		Dog  dog=(Dog)applicationContext.getBean("pdog");
		dog.bark();
		System.out.println(dog.hashCode());
		System.out.println(dog);
		
		Dog  dog1=(Dog)applicationContext.getBean("pdog");
		dog1.bark();
		System.out.println(dog1.hashCode());
		System.out.println(dog1);
		
		
		Dog  dog2=(Dog)applicationContext.getBean("pdog");
		dog2.bark();
		System.out.println(dog2.hashCode());
		System.out.println(dog2);
	}
}
