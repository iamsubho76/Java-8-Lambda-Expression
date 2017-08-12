package com.org.v106.Java_8_DoubleAdder;

import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdderServiceImpl implements DoubleAdderService {

	private DoubleAdder doubleAdder = new DoubleAdder();

	@Override
	public long increment() {
		doubleAdder.add(1.0);
		return doubleAdder.longValue();
	}

	@Override
	public long decrement() {
		doubleAdder.add(-1.0);
		return doubleAdder.longValue();
	}

	@Override
	public long getValue() {
		return doubleAdder.longValue();
	}

}
