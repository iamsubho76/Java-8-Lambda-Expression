package com.org.v126.Java_8_Comparators_nullsFirst_and_nullsLast_methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.org.model.Employee;

public class ClientTest {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30, ""));
		empList.add(new Employee("Martin", 40, ""));
		empList.add(new Employee(null, 40, ""));
		empList.add(new Employee("Alice", 23, ""));
		empList.add(new Employee("Martin", 25, ""));
		empList.add(new Employee("Barry", 34, ""));
		empList.add(new Employee(null, 34, ""));
		empList.add(new Employee("Martin", 35, ""));
		empList.add(new Employee(null, 34, ""));
		empList.add(new Employee("James", 45, ""));

		//System.out.println("Null First Demo....");
		//Comparator<Employee> comp = Comparator.comparing(Employee::getName,
		//		 Comparator.nullsFirst(String::compareTo));
		System.out.println("Null Last Demo....");
		Comparator<Employee> comp = Comparator.comparing(Employee::getName,
				Comparator.nullsLast(String::compareTo));
		empList.sort(comp);
		empList.forEach(System.out::println);

	}
}
