package com.example.jpademo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan(basePackages={"Repository"})
//@EnableJpaRepositories(basePackages={"Repository"})
//@SpringBootApplication(scanBasePackages= {"Repository"})
@SpringBootApplication
public class JpaDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}
}