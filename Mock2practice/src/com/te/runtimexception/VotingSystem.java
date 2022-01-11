package com.te.runtimexception;

public class VotingSystem {
	public static void main(String[] args) {
		int age = 20;
		try {
		if (age < 18) {
			throw new UnderAgeException();
		}}catch (UnderAgeException e) {
			System.out.println("hixl");
		}
	}
}
