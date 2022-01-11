package com.te.Springbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("pedegree");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("bark ");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
