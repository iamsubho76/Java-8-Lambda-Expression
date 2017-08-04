package com.org.v103_to_104.Java_8_LongAccumulator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

public class LongAccumulatorTest {

	public static void main(String[] args) {
		LongBinaryOperator accumulatorFunction = (x, y) -> x + y;
		LongAccumulator longAccumulator = new LongAccumulator(
				accumulatorFunction, 0L);

		LongAccumulatorTaskService taaks1 = new LongAccumulatorTaskServiceImpl(
				longAccumulator, 100L);
		LongAccumulatorTaskService taaks2 = new LongAccumulatorTaskServiceImpl(
				longAccumulator, 100L);

		List<Callable<Long>> tasks = new ArrayList<>();
		tasks.add(taaks1);
		tasks.add(taaks2);

		try {
			List<Future<Long>> invokeAll = Executors.newFixedThreadPool(2)
					.invokeAll(tasks);

			for (Future<Long> future : invokeAll) {
				future.get();
			}
			System.out.println(longAccumulator.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
