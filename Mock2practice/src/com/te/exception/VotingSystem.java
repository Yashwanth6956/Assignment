package com.te.exception;

public class VotingSystem {
	public static void main(String[] args) {
		int age = 17;
		
			if (age < 18) {
				try {
					throw new UnderAgeException();
				} catch (UnderAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 
		

	}
}
