package com.org.v38.Java_8_Stream_Pipeline;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		/*Stream<String> stream = Stream.of("a","b","c").filter(e->e.contains("b"));
		Optional<String> findAny = stream.findAny();
		System.out.println(findAny.get());
		Optional<String> findFirst = stream.findFirst();*/
		
		List<String> collect = Stream.of("a","b","c").filter(e->e.contains("b")).collect(Collectors.toList());
		
		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());
		
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
