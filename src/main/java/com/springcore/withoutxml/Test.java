package com.springcore.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s = (Student) context.getBean("student");
		System.out.println(s);
		s.study();
	}

}
