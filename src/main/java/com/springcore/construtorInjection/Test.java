package com.springcore.construtorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/construtorInjection/config.xml");
		Person p =(Person) context.getBean("person");
		
		System.out.println(p);
		
		Addition a = (Addition) context.getBean("addition");
		a.doSum();
	}
}
