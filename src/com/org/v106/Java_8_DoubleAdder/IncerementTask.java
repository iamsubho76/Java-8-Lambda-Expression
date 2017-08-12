package com.org.v106.Java_8_DoubleAdder;

import java.util.concurrent.Callable;

public class IncerementTask implements Callable<Long> {

	private DoubleAdderService doubleAdderService;
	private long noOfTimes;

	public IncerementTask(DoubleAdderService doubleAdderService, long noOfTimes) {
		super();
		this.doubleAdderService = doubleAdderService;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i < noOfTimes; i++) {
			doubleAdderService.increment();
		}
		return doubleAdderService.getValue();
	}

}
