package com.luv2code.spring.aop;

import org.aspectj.lang.JoinPoint;

public class Aspect {
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Hello from the before method!");
	}
	public void afterAdvice(JoinPoint jp) {
		System.out.println("Hello from the after method");
	}
	public void afterReturningAdvice() {
		System.out.println("Hello from the after-returning method");
	}
	public void afterThrowingAdvice() {
		System.out.println("Hello from the after-throwing method");
	}
	public void aroundAdvice() {
		System.out.println("*****************AROUND THE WORLD***********************");
	}
}
