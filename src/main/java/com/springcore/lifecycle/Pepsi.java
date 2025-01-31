package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	
	private double pepsi;

	public Pepsi(double pepsi) {
		super();
		this.pepsi = pepsi;
	}

	public double getPepsi() {
		return pepsi;
	}

	public void setPepsi(double pepsi) {
		this.pepsi = pepsi;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [pepsi=" + pepsi + "]";
	}
	


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
			System.out.println("Tacking Pepsi");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("Going to put bottel back to shop");
	}

}
