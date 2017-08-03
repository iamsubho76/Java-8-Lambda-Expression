package com.org.v21.JAVA_8_Closures_in_Lambda_Expressions;

public class Test {

	public static void main(String[] args) {

		int x = 30;
		int y = 40;
		doPerate(x, n -> System.out.println(n + y));
	}

	private static void doPerate(int i, Operation o) {
		o.operate(i);
	}
}
