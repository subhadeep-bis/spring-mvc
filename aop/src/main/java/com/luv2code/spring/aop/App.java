package com.luv2code.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleCalculator calculator = context.getBean("simpleCalculator", SimpleCalculator.class);
        calculator.add(5, 10);
        calculator.subtract(10, 5);
        ((ConfigurableApplicationContext)context).close();
    }
}
