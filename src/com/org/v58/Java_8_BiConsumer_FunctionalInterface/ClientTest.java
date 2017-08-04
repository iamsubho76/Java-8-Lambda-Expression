package com.org.v58.Java_8_BiConsumer_FunctionalInterface;

import java.util.HashMap;
import java.util.Map;

import com.org.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		// BiConsumer<Integer,String> biConsumer =
		// (k,v)->System.out.println("Key:"+k+"\t"+"Value:"+v);
		//map.forEach(biConsumer);
		map.forEach((k, v) -> System.out.println("Key:" + k + "\t" + "Value:" + v));

		Map<Integer, Student> stuMap = new HashMap<>();
		stuMap.put(1001, new Student("Martin",(int)902892892L));
		stuMap.put(1002, new Student("Frank", (int)5028956592L));

		stuMap.forEach((k, v) -> System.out.println("Key:" + k + "\t" + "Value:" + v));
	}

}
