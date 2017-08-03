package com.org.v25.JAVA_8_Handling_checked_exceptions_in_lambda;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {
	void accept(T t) throws E;
}
