package com.the.Demo;

public class STudent {
	
	private int sid;
	private String name;
	private String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public STudent(int sid, String name, String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	public STudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "STudent [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
