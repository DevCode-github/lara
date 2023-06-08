package com.lara;

public class Test {
	private String firstName;
	public Test() {
		System.out.println("test()");
	}
	public String getFirstName() {
		System.out.println("getFirstName");
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("setFirstName");
		this.firstName = firstName;
	}
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
}
