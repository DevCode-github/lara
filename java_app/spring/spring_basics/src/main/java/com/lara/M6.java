package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M6 {
	public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Person obj = context.getBean("p2",Person.class);
			System.out.println(obj.getFirstName());
			System.out.println(obj.getLastName());
			Address add = obj.getAddress();
			System.out.println(add.getHouseNo());
			System.out.println(add.getStreetName());
			
	}
}
