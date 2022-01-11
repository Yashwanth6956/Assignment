package com.te.Springbean;

import org.springframework.stereotype.Component;

@Component
public class Praveen implements Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("human pedgree");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("same as gorila sound ");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return false;
	}

}
