package pack2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class PersonManager {
	
	@Bean(name = "personObj", initMethod="method1", destroyMethod="method2" )//bean id
	public Person getPerson() {
		Person p1 = new Person();
		p1.setFirstName("abc");
		p1.setLastName("xyz");
		return p1;
	}
}
