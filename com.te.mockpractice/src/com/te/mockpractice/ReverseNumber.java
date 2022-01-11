package com.te.mockpractice;

public class ReverseNumber {
	public static void main(String[] args) {

		// tO REVERSE THE NUMBER
		/*
		 * int number = 66566566; int rev = 0;
		 * 
		 * while (number != 0) { int a = number % 10; rev = rev * 10 + a; number =
		 * number / 10;
		 * 
		 * } System.out.println(rev);
		 */

		// using array
		/*int number[] = { 1, 2, 3, 2, 1 };
		int[] rev = new int[number.length];
		int j = 0;

		for (int i = number.length - 1; i >= 0; i--) {

			rev[j] = number[i];
			j++;
		}
		for(int result:rev) {
			System.out.println(result);*/
		
		
		int array [ ] = {5,4,3,2,1,0};
		for(int i =0 ;i < array.length/2; i++) {
			int t = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=t;
		}
		for (int result : array) {
			System.out.println(result);
		}
	}

}
