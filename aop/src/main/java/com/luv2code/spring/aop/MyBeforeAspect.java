package com.luv2code.spring.aop;

import org.aspectj.lang.JoinPoint;

public class MyBeforeAspect {
	public void myAdvice(JoinPoint jp) {
		System.out.println("Before the method " + jp.getSignature().getName() + " started execution.");
	}
}
