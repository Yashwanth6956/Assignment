package com.te.thread;

public class Praveen extends Thread {
	Printer printer;

	public Praveen(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i);
		}
		
		System.out.println("praveen is printing");
	}

}
