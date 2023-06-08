package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M7 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("---------------------");
		Test obj = context.getBean("t1",Test.class);
		System.out.println(obj.getFirstName());
		context.registerShutdownHook();
	}
}
