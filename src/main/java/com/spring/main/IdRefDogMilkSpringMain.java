package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;
import com.spring.model.Milk;

public class IdRefDogMilkSpringMain {
	public static void main(String[] args) {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("idref-dog-milk.xml");
		Dog  dog=(Dog)applicationContext.getBean("pdog");
		dog.bark();
		System.out.println(dog);
		
		System.out.println("Accessing milk seperately!!!!!!!!");
		Milk  milk=(Milk)applicationContext.getBean("mmilk");
		System.out.println(milk);
	}
}
