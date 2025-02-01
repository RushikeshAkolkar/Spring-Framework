package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext config1 = new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		Emp e = (Emp) config1.getBean("emp1");
		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddress());
		System.out.println(e.getCoures());
		System.out.println(e.getPhones().getClass().getName());
	}

}
