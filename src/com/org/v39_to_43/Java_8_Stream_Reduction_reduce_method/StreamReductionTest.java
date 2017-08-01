package com.org.v39_to_43.Java_8_Stream_Reduction_reduce_method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import com.org.model.Product;

public class StreamReductionTest {
	public static void main(String[] args) {
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a+b);
		System.out.println(reduce.getAsInt());
		
		System.out.println("---------------------------------------------------------");
		
		int reduce2 = IntStream.range(1, 4).reduce(10, (a, b) -> a+b);
		System.out.println(reduce2);
		
		System.out.println("---------------------------------------------------------");
		
		Integer reduce3 = Arrays.asList(1,2,3).parallelStream().reduce(10, (a, b) -> a+b, (a, b) ->{
			System.out.println("Combiner is called..");
			return a+b;
		});
		
		System.out.println(reduce3);
		
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				new Product(14, "orange"), 
				new Product(13, "lemon"),
				new Product(23, "bread"), 
				new Product(13, "sugar"));
		
		// Custom collector
		Collector<Product, ?, LinkedList<Product>> toLinkedList = Collector.of(LinkedList::new, LinkedList::add, (first, second) -> { 
					first.addAll(second);
					return first;
				});

		LinkedList<Product> linkedListOfPersons = productList.stream().collect(toLinkedList);
		linkedListOfPersons.forEach(System.out::println);

	}

}
