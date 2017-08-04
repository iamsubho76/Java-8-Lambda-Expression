package com.org.v105.Java_8_LongAdder;

import java.util.concurrent.Callable;

public class IncrementTask implements Callable<Long> {

	private LongAdderService longAdderService;
	private long noOftimes;

	public IncrementTask(LongAdderService longAdderService, long noOftimes) {
		super();
		this.longAdderService = longAdderService;
		this.noOftimes = noOftimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i < noOftimes; i++) {
			longAdderService.increment();
		}
		return longAdderService.getValue();
	}

}
