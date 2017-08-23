package com.org.v119_to_120.Java_8_Comparator_before_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.org.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));
		
		System.out.println("Before sorting::::");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		System.out.println("-----------------------------------------");
		
		Collections.sort(empList, new EmployeeNameSorter());
		System.out.println("After sorting::::");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
	}
}
