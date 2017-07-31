package com.org.v23_to_24.Handling_unchecked_exceptions_in_lambda_PART1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(consumerWrapper(i -> System.out.println(50 / i), Exception.class));
	}

	//For V 24
	private static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Exception has occured:" + e.getMessage());
			}
		};
	}
	
	//For V 23
	private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Arithmatic Exception occured " + e.getMessage());
			}
		};
	}
}
