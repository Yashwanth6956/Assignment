package com.te.mockpractice;

import java.util.Scanner;

public class ArraySorting {

	static {
System.out.println("i will be 1st");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = scanner.nextInt();
		System.out.println("enter the elements to sort ");
		int elements[] = new int[size];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = scanner.nextInt();

		}

		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[i] > elements[j]) {
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;

				}

			}

		}
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i]);
		}

	}
}
