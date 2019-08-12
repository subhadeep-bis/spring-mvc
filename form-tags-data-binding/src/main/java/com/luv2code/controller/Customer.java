package com.luv2code.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	@NotNull(message="Can't be a null Value")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="Can't be a null Value")
	@Min(value=0, message="The minimum Value can't be less than zero.")
	@Max(value=10, message="The maximum value can't be greater than 10")
	private Integer freePass;
	
	@Pattern(regexp="[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	public Customer() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}