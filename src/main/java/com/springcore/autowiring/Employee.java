package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
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
