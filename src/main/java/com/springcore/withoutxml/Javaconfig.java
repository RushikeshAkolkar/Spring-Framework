package com.springcore.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration				//java configration class
public class Javaconfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp"})		//configation of Bean class has been created by using method
	public Student getStudent() {
		//creating student object
		Student s = new Student(getSamosa());
		return s;
	}
}
