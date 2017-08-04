package com.org.v61.Java_8_Function_FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.org.model.Student;

public class FunctionFunctionalInterfaceDemo {
	public static void main(String[] args) {
		List<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(new Student("Martin", 23));
		listOfStudent.add(new Student("Andrew", 20));
		listOfStudent.add(new Student("Sean", 21));
		
		for(Student st : listOfStudent){
			System.out.println(st.customShow(s -> s.getName() + "\t" + s.getAge()));
		}
		
		System.out.println("--------------------------------------------------------");
		
		Function<Student, String> stylrOne = s ->{
			String result = "Name: " + s.getName() + "\t" + "Age: " + s.getAge();
			return result;
		};
		
		for(Student st : listOfStudent){
			System.out.println(st.customShow(stylrOne));
		}
		
		System.out.println("--------------------------------------------------------");
		
		Function<Student, String> stylrTwo = s ->"Name: " + s.getName() + "\t" + "Age: " + s.getAge();
		
		for(Student st : listOfStudent){
			System.out.println(st.customShow(stylrTwo));
		}
	}
}
