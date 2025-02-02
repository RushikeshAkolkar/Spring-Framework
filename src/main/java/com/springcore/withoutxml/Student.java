package com.springcore.withoutxml;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	public void study() {
		System.out.println("Student reading book");
	}

}
