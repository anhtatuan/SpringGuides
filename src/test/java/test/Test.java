package test;

import java.util.concurrent.atomic.AtomicLong;

public class Test {
	public static void main(String[] args) {
		
		AtomicLong atomicLong = new AtomicLong(123);

		long expectedValue = 234;
		long newValue      = 123;
		atomicLong.compareAndSet(expectedValue, newValue);
		
		System.out.println(atomicLong);
	}
}
