package com.org.v125.Java_8_Comparators_natural_order_comparison_methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.org.model.Employee;

public class ClientTest {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30, ""));
		empList.add(new Employee("Martin", 40, ""));
		empList.add(new Employee("Alice", 23, ""));
		empList.add(new Employee("Martin", 25, ""));
		empList.add(new Employee("Barry", 34, ""));
		empList.add(new Employee("Martin", 35, ""));
		empList.add(new Employee("James", 45, ""));

		List<String> nameList = empList.stream().map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println("Before sorting..");
		nameList.forEach(System.out::println);
		//System.out.println("After Natural Order Sorting...");
		//nameList.sort(Comparator.naturalOrder());
		System.out.println("After Reverse Order Sorting...");
		nameList.sort(Comparator.reverseOrder());
		System.out.println("After sorting..");
		nameList.forEach(System.out::println);
	}
}
