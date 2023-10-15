package com.fileupload;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {

	private static AtomicInteger counter = new AtomicInteger(100);

	public static int getNext() {

		return counter.incrementAndGet();
	}

	public static int num() {
		int value = getNext();
		return value;
	}
}
