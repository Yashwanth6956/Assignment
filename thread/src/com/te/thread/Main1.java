package com.te.thread;

public class Main1 {
	public static void main(String[] args) {
		// Runnable runnable = new MyThread();// we can even do this
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		System.out.println("program is running");
		
		Thread currentThread = Thread.currentThread();
		System.out.println("The name of current thread is:"+currentThread.getName());
		//the code to set the name of thread
		currentThread.setName("bheem");
		System.out.println("the name of current thread is:"+currentThread.getName());
		thread.setName("chutki");
		
		//the code for id
		System.out.println("the thread id is"+currentThread.getId());
	}
	

}
