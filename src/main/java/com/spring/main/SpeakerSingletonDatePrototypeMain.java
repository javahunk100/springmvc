package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Speaker;

public class SpeakerSingletonDatePrototypeMain {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("speaker-date.xml");
		Speaker speaker=(Speaker)applicationContext.getBean("speaker");
		Thread.sleep(4000);
		System.out.println(speaker);
		 speaker=(Speaker)applicationContext.getBean("speaker");
		Thread.sleep(4000);
		System.out.println(speaker);
		
		 speaker=(Speaker)applicationContext.getBean("speaker");
		Thread.sleep(4000);
		System.out.println(speaker);
		
		 speaker=(Speaker)applicationContext.getBean("speaker");
		Thread.sleep(4000);
		System.out.println(speaker);
	}

}
