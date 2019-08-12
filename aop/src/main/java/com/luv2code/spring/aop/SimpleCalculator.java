package com.luv2code.spring.aop;

public class SimpleCalculator {
	public void add(int x, int y) {
		 System.out.println("Result of addition is: " + (x+y));
//		 throw new ArrayIndexOutOfBoundsException("Array Out of Bounds");
	}
	public void subtract(int x, int y) {
		 System.out.println("Result of subtraction is: " + (x-y));
	}
}
