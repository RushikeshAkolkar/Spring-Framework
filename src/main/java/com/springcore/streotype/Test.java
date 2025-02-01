package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streotype/stereoconfig.xml");
		Student s = (Student) context.getBean("Stud");
		System.out.println(s);
		System.out.println(s.getAddress().getClass().getName());
	}

}
