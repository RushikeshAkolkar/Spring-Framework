package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A temp = (A) context.getBean("aref");
		int a = temp.getX();//to get value of x from A class
		
		int b = temp.getOb().getY(); // to get value of Y from B class
		
		int c = a+b;
		System.out.println(c);

	}

}
