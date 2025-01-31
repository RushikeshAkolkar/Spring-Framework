package com.springcore.lifecycle;

import javax.annotation.PostConstruct;//this two annotation avaliable in 9+ version of jdk
import javax.annotation.PreDestroy;

public class Example {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}

}
