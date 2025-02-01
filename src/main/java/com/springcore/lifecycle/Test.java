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
		// ClassPathApplicationContext does not have registerShutdownHook() method of Bean LifeCycle Method
		
		 AbstractApplicationContext context = new
		 ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml"); Samosa
		 s = (Samosa) context.getBean("samosa"); 
		 //System.out.println(s); 
		 context.registerShutdownHook();
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		//System.out.println(p1);
		//no need to initand destry method in cofig.xml
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Example e1 = (Example) context.getBean("example");
		System.out.println(e1);
		context.registerShutdownHook();
	}

}
