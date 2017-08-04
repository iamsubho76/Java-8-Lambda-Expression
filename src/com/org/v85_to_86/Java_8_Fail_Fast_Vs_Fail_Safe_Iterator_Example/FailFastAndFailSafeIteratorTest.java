package com.org.v85_to_86.Java_8_Fail_Fast_Vs_Fail_Safe_Iterator_Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafeIteratorTest {

	public static void main(String[] args) {

		// failFastIteratorDemo();
		failSafeIteratorDemo();
	}

	private static void failFastIteratorDemo() {
		Map<String, String> phoneMap = new HashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");

		Set<String> keySet = phoneMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperia Z");
			String phoneType = iterator.next();
			System.out.println(phoneType + "\t" + phoneMap.get(phoneType));

		}
	}

	private static void failSafeIteratorDemo() {
		Map<String, String> phoneMap = new ConcurrentHashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");

		Set<String> keySet = phoneMap.keySet();

		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperia Z");
			String phoneType = iterator.next();
			System.out.println(phoneType + "\t" + phoneMap.get(phoneType));

		}
	}

}
