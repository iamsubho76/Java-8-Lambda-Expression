package com.org.v109.Java_8_Executors_Enhancements;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWorkStealingPoolTest {

	public static void main(String[] args) throws InterruptedException {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newWorkStealingPool(availableProcessors);

		Callable<String> c1 = () -> "My Task1";
		Callable<String> c2 = () -> "My Task2";
		Callable<String> c3 = () -> "My Task3";
		Callable<String> c4 = () -> "My Task4";
		
		List<Callable<String>> tasks = Arrays.asList(c1, c2, c3, c4);

		executorService.invokeAll(tasks).stream().map(future -> {
			try {
				return future.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}

}