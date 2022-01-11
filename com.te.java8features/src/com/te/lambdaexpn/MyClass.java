package com.te.lambdaexpn;

public interface MyClass {
	public static void main(String[] args) {
		/*
		 * // anonymus class = Test test = new Test() {
		 * 
		 * @Override public void message() {
		 * System.out.println("hi i am anonymys class ");
		 * 
		 * } };
		 * 
		 * test.message(); System.out.println("==========================");
		 * 
		 * Test test1 = () -> { System.out.println("hi i am lambda expression"); };
		 * 
		 * test1.message(); System.out.println("=========================="); Test2
		 * test2 = new Test2(); test2.message();
		 */

		// functional interface with parameter
		/*
		 * Test test=(i,j)->{ System.out.println(i+j); }; test.add(10, 20);
		 */
//Runnable and thread using lambda expression     
		Runnable run = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
			}

		};
		Thread thread = new Thread(run);
		thread.start();

	}
}
