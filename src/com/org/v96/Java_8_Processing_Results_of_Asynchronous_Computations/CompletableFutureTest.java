package com.org.v96.Java_8_Processing_Results_of_Asynchronous_Computations;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Beatiful");
		 completableFuture = completableFuture.thenApply(s->s+" World!!!");
		 
		 String result = completableFuture.get();
		 System.out.println(result);
		 
		 System.out.println("---------------------------------------------------");
		 
		 CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->"Beatiful");
		 
		 completableFuture2.thenAccept(s->{
			 System.out.println("My Computation is done::"+s);
		 });
		 completableFuture2.get();
		 
		 CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(()->"Beatiful");
		 
		 completableFuture3.thenRun(()->System.out.println("My Task is done.."));
		 
		 completableFuture3.get();
	}

}
