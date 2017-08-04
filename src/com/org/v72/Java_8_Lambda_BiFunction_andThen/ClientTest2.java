package com.org.v72.Java_8_Lambda_BiFunction_andThen;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClientTest2 {
	public static void main(String[] args) {
		BiFunction<String, Integer, Integer> biFunction = (designation, age) -> getSalaryByAgeAndDesignation(designation, age);
		
		Integer managerSalary = biFunction.apply("Manager", 31);
		System.out.println(managerSalary.intValue());
		
		Integer developerSalary = biFunction.apply("Developer", 26);
		System.out.println(developerSalary.intValue());
		
		
		Function<Integer, String> function = (sal) -> getBandBasedOnSalary(sal);
		
		String managerBand = biFunction.andThen(function).apply("Manager", 31);
		System.out.println(managerBand);
		
		String developerBand = biFunction.andThen(function).apply("Developer", 26);
		System.out.println(developerBand);
	}

	private static String getBandBasedOnSalary(Integer sal) {
		if(sal >= 100000){
			return "Band 5";
		}else if(sal >= 80000){
			return "Band 4";
		}else{
			return "Band 3";
		}
	}

	private static Integer getSalaryByAgeAndDesignation(String designation,
			Integer age) {
		if(designation != null && age != null){
			if(designation.equalsIgnoreCase("Manager") && age > 30){
				return 120000;
			}else if(designation.equalsIgnoreCase("Developer") && age > 25){
				return 90000;
			}else{
				return 0;
			}
		}else{
			return 0;
		}
	}
}
