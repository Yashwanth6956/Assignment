package com.te.meathodreference;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(1, 10, 7, 18, 99, 94, 34, 5, 7);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("====================");
		
		for(Integer integer:arrayList) {
			System.out.println(integer);
		}
		System.out.println("=====================");
		
		Iterator itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("======================== from for each meathod");

		arrayList.forEach(System.out::println);
	}

}
