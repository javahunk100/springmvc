package com.biz.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service("Chai")
@Scope("singleton")
@Lazy(false)
@Primary
public class Chai {
	
	public void call(){
		System.out.println("This is assertion library for JavaScript test cases");
		System.out.println("This is assertion library for JavaScript test cases");
	}
}
