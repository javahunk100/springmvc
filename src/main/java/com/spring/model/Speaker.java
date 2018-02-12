package com.spring.model;

import java.util.Date;

public abstract class Speaker {
	
	 public abstract Date  getInstance();

	@Override
	public String toString() {
		return "Speaker [doa=" + getInstance() + "]";
	}

}
