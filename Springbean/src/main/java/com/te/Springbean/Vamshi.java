package com.te.Springbean;

import org.springframework.stereotype.Component;

@Component
public class Vamshi implements Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("no food only drinks");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("yena naaa ");
		
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}

}
