package com.spring.model;

import java.util.Date;

public class Time {

	private Date ctime = new Date();
	
	public Time(){
		System.out.println("___Time is very precious!!!!");
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	@Override
	public String toString() {
		return "Time [ctime=" + ctime + "]";
	}

}
