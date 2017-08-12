package com.org.v106.Java_8_DoubleAdder;

import java.util.concurrent.Callable;

public class DecrementTask implements Callable<Long> {

	private DoubleAdderService doubleAdderService;
	private long noOfTimes;

	public DecrementTask(DoubleAdderService doubleAdderService, long noOfTimes) {
		super();
		this.doubleAdderService = doubleAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i < noOfTimes; i++) {
			doubleAdderService.decrement();
		}
		return doubleAdderService.getValue();
	}

}
