package com.org.v105.Java_8_LongAdder;

import java.util.concurrent.atomic.LongAdder;

public class LongAdderServiceImpl implements LongAdderService {

	private LongAdder longAdder = new LongAdder();

	@Override
	public long increment() {
		longAdder.increment();
		return longAdder.longValue();
	}

	@Override
	public long decrement() {
		longAdder.decrement();
		return longAdder.longValue();
	}

	@Override
	public long getValue() {
		return longAdder.longValue();
	}

}
