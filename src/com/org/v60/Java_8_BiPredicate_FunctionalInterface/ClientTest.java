package com.org.v60.Java_8_BiPredicate_FunctionalInterface;

import java.util.function.BiPredicate;

public class ClientTest {
	public static void main(String[] args) {
		BiPredicate<Integer, String> biPredicate = (i, o) -> i>220 && o.startsWith("S");
		System.out.println(biPredicate.test(223, "Subho"));
	}
}
