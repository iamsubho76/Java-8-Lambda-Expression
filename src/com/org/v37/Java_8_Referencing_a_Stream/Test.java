package com.org.v37.Java_8_Referencing_a_Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<String> filter = Stream.of("a", "b", "c").filter(e -> e.contains("b"));
		Optional<String> findAny = filter.findAny();
		
		System.out.println(findAny.get());
		
		//you can not re-used the Stream once it is consumed.
		//As we have tried to used the Stream again and will get Runtime Error.
		//Optional<String> findFirst = filter.findFirst();
		
		//So if you want to use multiple stream create one source for that as like below
		List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
		Optional<String> findAny2 = collect.stream().filter(e -> e.contains("c")).findAny();
		System.out.println(findAny2.get());
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
