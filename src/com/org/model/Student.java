package com.org.model;

import java.util.function.Function;

public class Student implements Comparable<Student>{
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public String customShow(Function<Student, String> function){
		return function.apply(this);
	}

	@Override
	public int compareTo(Student st) {
		return this.getName().compareTo(st.getName());
	}
}
