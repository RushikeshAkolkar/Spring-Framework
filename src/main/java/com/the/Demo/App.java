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
        ClassPathXmlApplicationContext config = new ClassPathXmlApplicationContext("com/the/Demo/config.xml");
        STudent s = (STudent) config.getBean("s1");
        System.out.println(s);
    }
}
