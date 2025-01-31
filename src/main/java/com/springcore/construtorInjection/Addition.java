package com.springcore.construtorInjection;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor int and int");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor double and double");
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor String and String");
	}
	public void doSum() {
		// TODO Auto-generated method stub
		System.out.println("Sum is ="+(this.a + this.b));
		
	}
}
