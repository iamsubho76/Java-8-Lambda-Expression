package com.org.model;

public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	private String deptName;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = (double) salary;
	}

	public Employee(String name, Double salary, String deptName) {
		super();
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", deptName="
				+ deptName + "]";
	}
}
