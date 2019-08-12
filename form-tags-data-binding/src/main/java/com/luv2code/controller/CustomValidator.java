package com.luv2code.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class CustomValidator {
	
	public static void main(String[] args) {
		 ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		 Validator validator = factory.getValidator();
		 Customer customer = new Customer();
		Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
		
		for (ConstraintViolation<Customer> violation : violations) {
		    System.out.println(violation.getMessage());
		}
	}
}
