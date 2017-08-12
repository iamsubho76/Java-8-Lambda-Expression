package com.org.v95.Java_8_runAsync_and_supplyAsync_methods_In_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task1 is completed..");
		});
		
		System.out.println("----------------------------------");
		
		CompletableFuture.runAsync(()->{
			System.out.println("My task2 is completed..");
		},Executors.newFixedThreadPool(2));
		
		System.out.println("----------------------------------");
		
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->"Hello World!!!");
		System.out.println(supplyAsync.get());
		System.out.println("----------------------------------");
		CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()->{
			return "Hello World!!!";
		},Executors.newCachedThreadPool());
		System.out.println(supplyAsync2.get());
		
		
	}

}
