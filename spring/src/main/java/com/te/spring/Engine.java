package com.te.spring;

public class Engine implements Garage {
	String name;
	double capacity;
	

	public Engine(String name, double capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}


	@Override
	public void start() {
		System.out.println(name+"engine starts and its capacity is"+capacity);
		
	}

}
