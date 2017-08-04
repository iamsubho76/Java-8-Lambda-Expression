package com.org.v67.Java_8_Lambda_Expressions_Best_Practices_Part2;

public class Test {
	public static void main(String[] args) {
		/*Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("My Task...");
			}
		};*/

		Runnable r = () -> System.out.println("My Task...");
		
		Thread t = new Thread(r);
		t.start();
	}
}
