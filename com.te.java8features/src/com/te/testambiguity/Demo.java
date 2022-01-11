package com.te.testambiguity;

public class Demo implements Test,Test2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Test.super.m1();
		System.out.println("from m1");
	}

}
