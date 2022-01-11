package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSea {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(5);
		t.add(-4);
		t.add(7);
		t.add(99);
		t.add(53);

		for (Object o : t) {
			System.out.println(o);
		}
		System.out.println("=================");
		List list = new ArrayList(t);
		ListIterator listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
