package com.te.spring1;

public class Engine implements Garage{
	String name;
	double capacity;
	
	
	

	public void setName(String name) {
		this.name = name;
	}




	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}




	public void start() {
		System.out.println(name+   "engine starts and capacity is"  +capacity);
		
	}

}
