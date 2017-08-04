package com.org.v59.Java_8_BiFunction_FunctionalInterface;

import java.util.function.BiFunction;

public class ClientTest {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result is : " + (num1 + num2);
		System.out.println(biFunction.apply(100, 200));
	}
}
