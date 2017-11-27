package com.org.v27.JAVA_8_Introduction_to_ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.org.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));

		 Stream<Student> parallelStream = list.parallelStream();
		 System.out.println("Students data send for processing in unorder:::");
		 parallelStream.forEach(ClientTest::doProcess);
		 
		 
		 Stream<Student> parallelStream2 = list.parallelStream();
		 System.out.println("Students data send for processing in inorder:::");
		 parallelStream2.forEachOrdered(ClientTest::doProcess);
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
