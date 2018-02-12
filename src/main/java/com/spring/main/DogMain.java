package com.spring.main;

import com.spring.model.Dog;

public class DogMain {
	public static void main(String[] args) {
		//who is creating instance of Dog ? programmer
		//who is managing the life of the object ? programmer
		Dog dog=new Dog(); 
		dog.bark();
		System.out.println(dog);
	}
}
