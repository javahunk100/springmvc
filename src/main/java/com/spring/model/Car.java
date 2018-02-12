package com.spring.model;

import java.util.Date;

public class Car {
	private String name;
	private String color;
	private Date dom = new Date();
	private Engine engine;
	private Tyres tyres;
	
	public Car(){
		
	}
	
	public Car(Engine engine,Tyres tyres){
		this.engine=engine;
		this.tyres=tyres;
	}
	
	public Car(Engine engine){
		this.engine=engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDom() {
		return dom;
	}

	public void setDom(Date dom) {
		this.dom = dom;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tyres getTyres() {
		return tyres;
	}

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", dom=" + dom + ", engine=" + engine + ", tyres=" + tyres
				+ "]";
	}

}
