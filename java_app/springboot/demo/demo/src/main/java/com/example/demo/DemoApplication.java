package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("starting app .");
//		int i = 0;
//		while(i <= 3) {
//			Thread.sleep(1000);
//			System.out.print(".");
//			i++;
//		}
//		System.out.println();
		System.out.println("app started");
	}

}
