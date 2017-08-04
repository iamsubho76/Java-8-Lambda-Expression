package com.org.v66.Java_8_Lambda_Expressions_Best_Practices_Part1;

import java.util.function.Function;

public class UseFoo {

	/*
	 * public String add(String name,Foo foo){ return foo.method(name); }
	 */

	public String add(String name, Function<String, String> fn) {
		return fn.apply(name);
	}
}
