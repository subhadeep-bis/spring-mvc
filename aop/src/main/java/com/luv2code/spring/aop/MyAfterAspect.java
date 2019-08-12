package com.luv2code.spring.aop;

import org.aspectj.lang.JoinPoint;

public class MyAfterAspect {
	public void afterAdvice(JoinPoint jp) {
		System.out.println("Hello From The After Method.");
	}
}
