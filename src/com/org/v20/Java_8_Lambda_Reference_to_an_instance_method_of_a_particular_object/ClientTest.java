package com.org.v20.Java_8_Lambda_Reference_to_an_instance_method_of_a_particular_object;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Richard");
		names.add("Samuel");
		names.add("Rose");
		names.add("John");

		// names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
	}

}