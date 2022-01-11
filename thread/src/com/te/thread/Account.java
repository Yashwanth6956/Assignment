package com.te.thread;

 public  class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withDraw(int amount) {
		if(balance<amount) {
			System.out.println("Innsufficent funds");
		}else {
			balance-=amount;
		}
	}
	
	synchronized public void  deposit(int amount) {
		balance=balance+amount;

}
	public void checkBalance(){
		System.out.println(balance);
	}
}