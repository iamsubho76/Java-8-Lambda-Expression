package com.org.v64.Java_8_Supplier_Functional_Interface;

import java.util.Random;
import java.util.function.Supplier;

public class SuppilerFunctionalInterfaceDemo {
	public static void main(String[] args) {
		Supplier<Integer> supplier = SuppilerFunctionalInterfaceDemo::getNum;
		for(int i=0; i<20; i++){
			System.out.println(supplier.get());
		}
	}
	
	private static Integer getNum(){
		Random random = new Random();
		return random.nextInt(100);
	}
}
