package com.luv2code.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private Map<String, String> countries;
	private String favoriteLang;
	private String[] experience;
	public Student() {
		super();
		countries = new HashMap<String, String>();
		countries.put("Brazil", "BRAZIL");
		countries.put("India", "INDIA");
		countries.put("Germany", "Germany");
		countries.put("Australia", "Australia");
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Map<String, String> getCountries() {
		return Collections.unmodifiableMap(countries);
	}
	public String getFavoriteLang() {
		return favoriteLang;
	}
	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}
	public String[] getExperience() {
		return experience;
	}
	public void setExperience(String[] experience) {
		this.experience = experience;
	}
}
