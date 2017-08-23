package com.org.v119_to_120.Java_8_Comparator_before_java8;

import java.util.Comparator;

import com.org.model.Employee;

public class EmployeeNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
