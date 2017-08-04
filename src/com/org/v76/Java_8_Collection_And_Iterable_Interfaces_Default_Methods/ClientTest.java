package com.org.v76.Java_8_Collection_And_Iterable_Interfaces_Default_Methods;

import java.util.ArrayList;
import java.util.List;

import com.org.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Raj", 90000.00, "HR"));
		empList.add(new Employee("Frank", 80000.00, "Finance"));
		empList.add(new Employee("Kishan", 30000.00, "HR"));
		empList.add(new Employee("Sean", 90000.00, "Finance"));
		empList.add(new Employee("Rajesh", 90000.00, "HR"));

		empList.forEach(s -> System.out.println(s));
		System.out.println("------------------------------------------------");

		empList.removeIf(s -> "HR".equalsIgnoreCase(s.getDeptName()));

		empList.forEach(s -> System.out.println(s));

	}

}
