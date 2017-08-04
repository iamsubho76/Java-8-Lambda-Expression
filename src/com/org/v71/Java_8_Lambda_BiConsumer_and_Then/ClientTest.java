package com.org.v71.Java_8_Lambda_BiConsumer_and_Then;

import java.util.function.BiConsumer;

public class ClientTest {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> adder = (I1, I2) -> System.out.println("Adder:" + (I1 + I2));
		BiConsumer<Integer, Integer> multiplier = (I1, I2) -> System.out.println("Multiplier:" + (I1 * I2));

		adder.andThen(multiplier).accept(30, 50);
		System.out.println("--------------------------------------");
		multiplier.andThen(adder).accept(10, 30);

	}

}
