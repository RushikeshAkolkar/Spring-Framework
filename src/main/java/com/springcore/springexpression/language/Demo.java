package com.springcore.springexpression.language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+22}")
	private int x;
	@Value("#{33+44}")   	//this type of value is called as spring expression language
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")		//call static method of predefine class. you can check using shift+ctrl+t after pressing type package name and see.
	private double z;
	@Value("#{T(java.lang.Math).PI}")		// access static variable value
	private double e;
	@Value("#{new java.lang.String('Rushiikesh Akolkar')}")
	private String name;
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
}
