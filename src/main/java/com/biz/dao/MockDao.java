package com.biz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//<bean id="MockDao" class="com.biz.dao.MockDao" scope="singleton"/>
//@Component , @Controller , @Service
@Repository("MockDao")
public class MockDao {
	
	// - >> byType - >> Qualifier - >> byName 
	@Autowired
	@Qualifier("Chai")
	private Chai chai;
	
	public void show(){
		chai.call();
		System.out.println(")@)@)@)@)@8@");
	}

}
