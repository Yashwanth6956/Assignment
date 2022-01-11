package com.te.meathodreference;

public class MyClass {
	int sum(int i, int j) {
		return i + j;
	}
	
	static int  addition(int i,int j) {
		return i+j;
	}

public static void main(String[] args) {
	  
	  Test test=new MyClass()::sum;
	  
	  Test test1=MyClass::addition;
	  System.out.println(test1.add(2, 3));
}

}
