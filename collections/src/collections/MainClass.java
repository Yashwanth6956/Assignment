package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<>();
		Student s1 = new Student(1, "yash", 88);
		Student s2 = new Student(2, "mani", 55);
		Student s3 = new Student(3, "shanku", 65);
		Student s4 = new Student(4, "ajay", 75);
		Student s5 = new Student(5, "tarun", 99);
		hashSet.add(s1);
		hashSet.add(s2);
		
		hashSet.add(s3);
		hashSet.add(s4);
		hashSet.add(s5);

		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======================");
		ArrayList arrayList = new ArrayList(hashSet);
		Collections.sort(arrayList, new SortByName());
		//Collections.sort(arrayList, new SortByMarks());

		Iterator iterator2 = arrayList.iterator();

		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
