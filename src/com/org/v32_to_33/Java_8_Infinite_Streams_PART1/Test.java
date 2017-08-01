package com.org.v32_to_33.Java_8_Infinite_Streams_PART1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> iterate = Stream.iterate(0, i -> i + 2);
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
