package com.org.v63.Java_8_BinaryOperator_Functional_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("X", "A");
		map.put("Y", "B");
		map.put("Z", "C");
		BinaryOperator<String> binaryOpt = (s1, s2) -> s1 + "-" + s2;
		List<String> binaryOptFunc = binaryOptFunc(binaryOpt, map);
		binaryOptFunc.forEach(System.out::println);
	}

	private static List<String> binaryOptFunc(BinaryOperator<String> binaryOpt, Map<String, String> map) {
		List<String> bList = new ArrayList<>();
		map.forEach((s1, s2) -> bList.add(binaryOpt.apply(s1, s2)));
		return bList;
	}
}
