package com.org.v68.Java_8_Lambda_Expressions_Best_Practices_Part3;

public class Test {
	private String value = "Enclosing scope value";
	public static void main(String[] args) {
		new Test().scopeExperiment();
	}
	private void scopeExperiment() {
		Foo foo1 = new Foo(){
			private String value = "Inner class value";
			@Override
			public String method() {
				return this.value;
			}
		};
		System.out.println(foo1.method());
		Foo foo2 = () -> {
			String value = "Lambda Value";
			return this.value;
		};
		System.out.println(foo2.method());
	}
}

@FunctionalInterface
interface Foo{
	String method();
}