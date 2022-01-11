package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet();
		hashset.add(10);
		hashset.add(20);
		hashset.add(20);
		hashset.add(30);
		hashset.add(50);

		for (Integer x : hashset) {      //for (int x : hashset) >we can even give int autoboxing and unboxing concept
			System.out.println(x);
		}

		System.out.println("=====================");

		Iterator itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
