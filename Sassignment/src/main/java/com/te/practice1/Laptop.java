package com.te.practice1;

public class Laptop {
	String name;
	Battery b;
	
	
	
	public Laptop(String name, Battery b) {
		super();
		this.name = name;
		this.b = b;
	}



	public void on() {
		b.charging();
		System.out.println(name+  "  switched on successfully");
	}
	
	

}
