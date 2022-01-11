package com.te.thread;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("the name of current thread is:"+Thread.currentThread().getName());
		System.out.println("the id of current thread is:"+Thread.currentThread().getId());
		for (int i=1;i<10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
