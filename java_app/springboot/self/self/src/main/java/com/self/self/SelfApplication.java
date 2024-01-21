package com.self.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"fileupload","download","refresh","mail"})
public class SelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfApplication.class, args);
	}

}
