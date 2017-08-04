package com.org.v74.Java_8_Lambda_BiPredicate_and_or_and_negate;

import java.util.function.BiPredicate;

public class BiPredicateClientTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate1 = (x,y) -> x>y;
		BiPredicate<Integer, Integer> biPredicate2 = (x,y) -> x-2>=y;
		
		System.out.println(biPredicate1.and(biPredicate2).test(20, 50));
		System.out.println(biPredicate1.and(biPredicate2).test(10, 8));
		System.out.println("----------------------------------------");
		System.out.println(biPredicate1.or(biPredicate2).test(10, 15));
		System.out.println(biPredicate1.or(biPredicate2).test(15, 8));
		System.out.println("----------------------------------------");
		boolean test = biPredicate1.negate().test(20, 80);
		System.out.println(test);
	}
}
