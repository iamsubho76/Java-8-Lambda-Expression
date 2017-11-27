package com.org.miscellaneous;

import java.util.Arrays;
import java.util.List;

import com.org.model.Employee;

public class TestEmployeeStream {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("Subho1", (double)1000, "IT"),
				new Employee("Subho12", (double)1000, "HR"),
				new Employee("Subho123", (double)1000, "QA"),
				new Employee("Subho1234", (double)1000, "IT"),
				new Employee("Subho12345", (double)1000, "HR"),
				new Employee("Subho123456", (double)1000, "Finance"),
				new Employee("Subho1234567", (double)1000, "Manager"),
				new Employee("Subho12345678", (double)1000, "Manager"),
				new Employee("Subho1234567890", (double)1000, "Senior Manager"));

		empList.sort(comparing(Employee::getName));
	}
}
