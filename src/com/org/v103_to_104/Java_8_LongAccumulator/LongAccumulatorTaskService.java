package com.org.v103_to_104.Java_8_LongAccumulator;

import java.util.concurrent.Callable;

public interface LongAccumulatorTaskService extends Callable<Long> {

	long increment();

	long finalValue();
}
