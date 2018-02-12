package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Car;

public class CarEngineTyresNoSpringMain {
	public static void main(String[] args) {
		//Creating instance of spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("car-engine-tyres-no.xml");
		Car  car=(Car)applicationContext.getBean("car");
		System.out.println(car);
		System.out.println("Accessing car bean second time from the spring container!!");
		car=(Car)applicationContext.getBean("car");
		System.out.println(car);
		
	}
}
