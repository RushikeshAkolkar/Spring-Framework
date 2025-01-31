package com.the.Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext config = new ClassPathXmlApplicationContext("config.xml");
        STudent s = (STudent) config.getBean("student");
        System.out.println(s);
        STudent s1 = (STudent) config.getBean("stud");
        System.out.println(s1);
    }
}
