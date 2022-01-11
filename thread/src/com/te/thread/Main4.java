package com.te.thread;

public class Main4 {
public static void main(String[] args) throws InterruptedException {
	Printer printer = new Printer(0);
	Shashi shashi = new Shashi(printer);
	Praveen praveen = new Praveen(printer);
	
	shashi.start();
    praveen.start();
    
    shashi.join();
    praveen.join();
    
    System.out.println("wait completed");
    
    printer.totalPages();
}

}
