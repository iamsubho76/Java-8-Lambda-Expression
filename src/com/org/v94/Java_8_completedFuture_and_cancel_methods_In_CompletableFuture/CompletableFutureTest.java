package com.org.v94.Java_8_completedFuture_and_cancel_methods_In_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World!!!");
		String result = completedFuture.get();
		System.out.println(result);
		
	}

}
