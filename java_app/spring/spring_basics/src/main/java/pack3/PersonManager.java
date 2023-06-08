package pack3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "pack3")
@Configuration
public class PersonManager {
	@Bean(name="p1")
	public Person getPerson() {
		Person p1 = new Person();
		return p1;
	}
}
