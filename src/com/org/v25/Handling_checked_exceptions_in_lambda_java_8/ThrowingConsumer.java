package com.org.v25.Handling_checked_exceptions_in_lambda_java_8;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {
	void accept(T t) throws E;
}
