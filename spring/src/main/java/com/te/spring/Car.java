package com.te.spring;

public class Car {
	Garage g;
	String name;

	
	
	public Car(Garage g, String name) {
		super();
		this.g = g;
		this.name = name;
	}



	public void move() {
		g.start();
		System.out.println(name+" is moving");
		
	}
	
	
	

}
