package com.springcore.collections.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalonecollections/config.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getFeeStructure().getClass().getName());
		System.out.println(p.getProperties().getClass().getName());
	}

}
