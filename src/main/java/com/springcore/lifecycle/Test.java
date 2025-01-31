package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml"); Samosa
		 * s = (Samosa) context.getBean("samosa"); System.out.println(s);
		 */
		
		//we require pre shoutdown hook to enable to call destroy method
		/*
		 * AbstractApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml"); Samosa
		 * s = (Samosa) context.getBean("samosa"); System.out.println(s); //registring
		 * shutdown hook context.registerShutdownHook();
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		 */
		AbstractApplicationContext context = new
				 ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		context.registerShutdownHook();
		//no need to initand destry method in cofig.xml
	}

}
