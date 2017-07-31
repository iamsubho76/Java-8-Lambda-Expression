package com.org.v26.Introduction_to_Java_8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		String[] arr = new String[]{"AA", "BB", "CC"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		
		Stream<String> of = Stream.of("A", "B", "C", "D");
		of.forEach(System.out::println);
		
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
		listOfInteger
			.stream()
			.forEach(System.out::println);
	}
}
