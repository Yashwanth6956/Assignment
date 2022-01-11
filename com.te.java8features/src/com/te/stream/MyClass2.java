package com.te.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyClass2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet();
		set.add(new Student(1, "yash", 35, "b"));
		set.add(new Student(2, "barath", 40, "a"));
		set.add(new Student(3, "mani", 26, "a"));
		set.add(new Student(4, "shanmukh", 66, "d"));
		set.add(new Student(5, "siri", 95, "c"));
		set.add(new Student(6, "anni", 88, "c"));

		set.stream().min(Comparator.comparing(Student::getMarks)).ifPresent(System.out::println);
		System.out.println("====================================================================");
		set.stream().max(Comparator.comparing(Student::getId)).ifPresent(System.out::println);
		System.out.println("=====================================================================");
		Map<String, List<Student>> collect = set.stream().collect(Collectors.groupingBy(Student::getSection));

		collect.forEach((sections, stu) -> {
			System.out.println(sections);
			stu.forEach(System.out::println);

		});
		System.out.println("===========================================================================");

		set.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

		System.out.println("===========================================================================");
		set.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		System.out.println("===========================================================================");
		set.stream().sorted(Comparator.comparing(Student::getSection)).forEach(System.out::println);

		System.out.println("===========================================================================");
		set.stream().filter(st->st.getMarks()>40).forEach(System.out::println);//doubt collector?

	}

}
