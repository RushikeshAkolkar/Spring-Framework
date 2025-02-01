package com.springcore.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Stud")				//give Bean Name 
@Scope("prototype")				//different object has been created otherwise same object created. check by using .hashCode() method
public class Student {
	@Value("Rushikesh Akolkar")
	private String name;
	@Value("Ahilyanagar")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	

}
