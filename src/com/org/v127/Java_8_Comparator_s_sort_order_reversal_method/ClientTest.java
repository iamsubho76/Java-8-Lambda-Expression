package com.org.v127.Java_8_Comparator_s_sort_order_reversal_method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

		Comparator<Employee> comparingByName = Comparator.comparing(Employee::getName);
		System.out.println("--------------------------------------------------------");
		empList.sort(comparingByName);
		empList.forEach(System.out::println);
		System.out.println("----------------------Reversed----------------------------------");
		empList.sort(comparingByName.reversed());
		empList.forEach(System.out::println);
		
	}
}
