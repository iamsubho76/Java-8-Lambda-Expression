package com.org.v1_to_v3_.Java_8_From_PermGen_to_Metaspace_PART1_to_PART3;

import java.util.Collections;
import java.util.List;

import com.org.model.Student;

public interface MyInterface {
	default public List<Student> sortStudents(List<Student> studentList) {
		Collections.sort(studentList);
		return studentList;
	}
	
	public static void greet(String name){
		System.out.println("Welcome " + name);
	} 
	
	public abstract Integer getMaxNum(List<Integer> intList);
}
