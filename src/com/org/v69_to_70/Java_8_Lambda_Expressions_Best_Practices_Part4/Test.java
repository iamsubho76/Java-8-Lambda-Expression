package com.org.v69_to_70.Java_8_Lambda_Expressions_Best_Practices_Part4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (s1, s2) -> getFullName(
				s1, s2);

		String apply = biFunction.apply("Subhobroto", "Roy");
		System.out.println(apply);
		
		System.out.println("--------------------------------");
		Function<String, String> function = (s) -> "Hi, " + s;
		String apply2 = function.apply("Subho");
		System.out.println(apply2);
		
		System.out.println("--------------------------------");
		//Function<String, String> function1 = s->s.toUpperCase();
		Function<String, String> function1 = String::toUpperCase;
		String apply3 = function1.apply("Subhobroto");
		System.out.println(apply3);
		
		System.out.println("--------------------------------");
		new Test().method();
	}

	private void method(){
		String localVariable = "Local";
		Function<String, String> function2 = s ->{
			//String localVariable = s;
			//return s;
			return localVariable;
		};
		String apply = function2.apply("Hi.............");
		System.out.println(apply);
	}
	
	private static String getFullName(String s1,
			String s2) {
		String firstName = s1.toUpperCase();
		String lastName = s2.toUpperCase();
		String result = firstName + "\t" + lastName;
		return result;
	}
}
