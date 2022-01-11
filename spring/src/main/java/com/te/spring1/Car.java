package com.te.spring1;

public class Car {
	String name;
	Garage g;
	
	
	


	public void setName(String name) {
		this.name = name;
	}





	public void setG(Garage g) {
		this.g = g;
	}





	public void move() {
		g.start();
		System.out.println("car is moving");
	}

}
