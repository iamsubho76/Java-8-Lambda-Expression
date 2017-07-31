package com.org.v17.Java_8_Lambda_Reference_to_a_static_method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Runnable command = ClientTest::myRun;
		executorService.execute(command);
	}

	private static void myRun() {
		System.out.println("My Task is running");
	}
}
