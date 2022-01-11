package com.te.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(101, "yash", 10000, "developer", 24),
				new Employee(102, "hemu", 15000, "tester", 22), new Employee(104, "mahadev", 19000, "developer", 29),
				new Employee(105, "rudra", 17800, "watchman", 27), new Employee(106, "raju", 190000, "manager", 21));

		Employee e = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (e.getAge() > list.get(i).getAge()) {
				e = list.get(i);
			}
		}
		System.out.println(e);
		System.out.println("===========================================");

		Stream<Employee> stream = list.stream();
		Optional<Employee> min = stream.min(Comparator.comparing(Employee::getSalary));
		System.out.println(min);
		System.out.println("=============================================");

		list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);

		System.out.println("==============================================");

		// sorting
		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEmployeeName))
				.collect(Collectors.toList());

		collect.forEach(System.out::println);
		System.out.println("==============================================");

		list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("===============================================");

		Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		collect2.forEach((department, emp) -> {
			System.out.println(department);
			emp.forEach(System.out::println);
		});
			System.out.println("=============================================");

			Stream<Employee> filter = list.stream().filter(em -> em.getAge() > 20);
			System.out.println("=====================================================");

			list.stream().filter(em -> em.getSalary() > 15000).collect(Collectors.toList())
					.forEach(System.out::println);
			System.out.println("=======================================================");
			boolean anyMatch = list.stream().anyMatch(em -> em.getAge() > 10);
			System.out.println(anyMatch);
		

	}

}
