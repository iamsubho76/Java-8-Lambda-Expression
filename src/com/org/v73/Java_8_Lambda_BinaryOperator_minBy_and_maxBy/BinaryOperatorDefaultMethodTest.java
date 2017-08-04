package com.org.v73.Java_8_Lambda_BinaryOperator_minBy_and_maxBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.org.model.Employee;

public class BinaryOperatorDefaultMethodTest {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("A", 70000.00, "HR"));
		empList.add(new Employee("B", 20000.00, "HR"));
		empList.add(new Employee("C", 50000.00, "HR"));
		empList.add(new Employee("D", 60000.00, "HR"));

		empList.add(new Employee("X", 30000.00, "Finance"));
		empList.add(new Employee("Y", 25000.00, "Finance"));
		empList.add(new Employee("W", 15000.00, "Finance"));
		empList.add(new Employee("P", 45000.00, "Finance"));

		Comparator<Employee> salaryComparator = Comparator
				.comparing(Employee::getSalary);

		Map<String, Optional<Employee>> maxSalByDept = empList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDeptName, Collectors
								.reducing(BinaryOperator
										.maxBy(salaryComparator))));

		maxSalByDept.forEach((deptName, emp) -> {
			System.out.println(deptName);
			Employee employee = emp.get();
			System.out.println(employee);
		});
		
		System.out.println("---------------------------------------------------------------");

		Map<String, Optional<Employee>> minSalByDept = empList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDeptName, Collectors
								.reducing(BinaryOperator
										.minBy(salaryComparator))));

		minSalByDept.forEach((deptName, emp) -> {
			System.out.println(deptName);
			Employee employee = emp.get();
			System.out.println(employee);
		});
	}
}
