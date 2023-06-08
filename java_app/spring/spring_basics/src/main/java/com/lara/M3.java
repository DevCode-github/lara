package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer cst = context.getBean("c1", Customer.class);
		System.out.println(cst.getFirstName());
		System.out.println(cst.getLastName());
		Address add = cst.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		
	}
}
