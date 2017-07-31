package com.org.v29.Java_8_Stream_Filtering_and_matching_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.org.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));

		Stream<Student> filteredList = list.stream().filter(s -> s.getAge() > 25);
		filteredList.forEach(System.out::println);

		boolean anyMatch = list.stream().anyMatch(s -> s.getName().contains("S"));
		System.out.println(anyMatch);

		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("S"));
		System.out.println(allMatch);

		boolean anyMatch2 = list.stream().anyMatch(s -> s.getAge() > 32);
		System.out.println(anyMatch2);
	}
}
