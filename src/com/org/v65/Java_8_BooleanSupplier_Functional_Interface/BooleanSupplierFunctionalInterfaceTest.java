package com.org.v65.Java_8_BooleanSupplier_Functional_Interface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFunctionalInterfaceTest {
	public static void main(String[] args) {
		BooleanSupplier booleanSupplier = () -> true;
		System.out.println(booleanSupplier.getAsBoolean());
		
		int x = 100;
		int y = 70;
		
		booleanSupplier = ()-> x > y;
		System.out.println(booleanSupplier.getAsBoolean());
	}
}
