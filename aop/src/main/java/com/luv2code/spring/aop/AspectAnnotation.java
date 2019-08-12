package com.luv2code.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAnnotation {
	
	@Before("execution(* com.luv2code.spring.aop.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("AdviceAnnotation class: Before Execution of " +  jp.getSignature().getName() + " method");
	}
	
	@After("execution(* com.luv2code.spring.aop.*.*(..))")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("AdviceAnnotation class: After Execution of " +  jp.getSignature().getName() + " method");
	}
}
