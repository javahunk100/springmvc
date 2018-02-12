package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;

public class LazyDogSpringMain {
	public static void main(String[] args) {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("lazy-dogs.xml");
		System.out.println("_!_!_!_!_Spring container is ready now!!!!!!!!!!");
		System.out.println("____feching first bean ");
		Dog  dog=(Dog)applicationContext.getBean("pdog");
		dog.bark();
		System.out.println(dog);
		
		System.out.println("____feching second bean ");
		Dog  dog1=(Dog)applicationContext.getBean("pdog1");
		dog1.bark();
		System.out.println(dog1);
		
		System.out.println("____feching third bean ");
		
		Dog  dog2=(Dog)applicationContext.getBean("pdog2");
		dog2.bark();
		System.out.println(dog2);
	}
}
