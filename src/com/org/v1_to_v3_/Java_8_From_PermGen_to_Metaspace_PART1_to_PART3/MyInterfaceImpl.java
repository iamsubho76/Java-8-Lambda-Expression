package com.org.v1_to_v3_.Java_8_From_PermGen_to_Metaspace_PART1_to_PART3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.org.model.Student;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer maxNumber = Collections.max(intList);
		return maxNumber;
	}

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		List<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(new Student("Subho", 27));
		listOfStudent.add(new Student("Soumen", 24));
		listOfStudent.add(new Student("Siben", 21));
		List<Student> sortStudents = myInterface.sortStudents(listOfStudent);
		for (Student st : sortStudents) {
			System.out.println(st.getName() + "\t" + st.getAge());
		}
		MyInterface.greet("Babai");

		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(1000);
		listOfInteger.add(10);
		listOfInteger.add(5000);
		listOfInteger.add(800);
		Integer maxNum = myInterface.getMaxNum(listOfInteger);
		System.out.println("Max No. " + maxNum);
	}
}
