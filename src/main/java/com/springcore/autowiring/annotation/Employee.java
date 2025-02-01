package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")  //if multiple beans of same class having values in that case we have to use
	private Address address;//variable name in class file and config.xml file should by same for using autowiring byName

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
