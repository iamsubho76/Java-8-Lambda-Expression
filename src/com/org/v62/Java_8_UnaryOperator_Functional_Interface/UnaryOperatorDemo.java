package com.org.v62.Java_8_UnaryOperator_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		UnaryOperator<Integer> unaryOpt = i -> i * 10;
		unaryOperatorFun(unaryOpt, asList).forEach(System.out::println);
	}

	private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> asList) {
		List<Integer> unList = new ArrayList<Integer>();
		asList.forEach(i -> unList.add(unaryOpt.apply(i)));
		return unList;
	}
}
