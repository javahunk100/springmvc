package com.spring.model;

//POJO- plain old java object
//POJI- plain old java interface
public class Dog {

	private String name = "tommy";
	private String color = "white";
	private int age = 2;
	private Milk milk;
	private String beanName;
	
	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public Dog(){
		System.out.println("______________###########################________________");
		System.out.println("______________#####WELCOME DOG!!!########________________");
		System.out.println("______________###########################________________");
	}

	public Dog(String name, String color, int age, Milk milk) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.milk = milk;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void bark() {
		System.out.println("Dog barks at night!!!!!");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + ", milk=" + milk + ", beanName=" + beanName
				+ "]";
	}

}
