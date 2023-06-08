package pack3;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public Address() {
		System.out.println("Address()");
	}
	public String sayHello() {
		System.out.println("sayHello");
		return "from sayHello";
	}
}
