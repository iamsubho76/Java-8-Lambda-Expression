package com.org.v99.Java_8_Handling_Errors_In_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		String name = null;
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
			if(name == null){
				throw new RuntimeException("Computation Error!!!");
			}
			return "Hello,"+name;
		}).handle((s,t)->s!=null?s:"Hello,Stranger!!");
		
		System.out.println(completableFuture.get());
	}
}