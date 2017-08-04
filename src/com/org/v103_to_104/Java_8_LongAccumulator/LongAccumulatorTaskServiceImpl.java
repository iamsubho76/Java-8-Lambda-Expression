package com.org.v103_to_104.Java_8_LongAccumulator;

import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorTaskServiceImpl implements
		LongAccumulatorTaskService {

	private LongAccumulator longAccumulator;
	private long noOfTimes;

	public LongAccumulatorTaskServiceImpl(LongAccumulator longAccumulator,
			long noOfTimes) {
		super();
		this.longAccumulator = longAccumulator;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 1; i <= noOfTimes; i++) {
			increment();
		}
		return longAccumulator.get();
	}

	@Override
	public long increment() {
		longAccumulator.accumulate(10L);
		return longAccumulator.get();
	}

	@Override
	public long finalValue() {
		return longAccumulator.get();
	}
}
