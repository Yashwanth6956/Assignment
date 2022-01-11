package com.te.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		d.start();
		for(int i=11;i<20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		d.join();		
		
	}

}
