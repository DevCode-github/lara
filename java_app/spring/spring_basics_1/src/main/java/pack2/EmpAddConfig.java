package pack2;

import org.springframework.context.annotation.Bean;

public class EmpAddConfig {
	@Bean
	public Address dfsf() {
		Address add = new Address();
		add.zip = 42423;
		add.street = "fsf";
		return add;
	}
	@Bean(name="e")
	public Employee kljlj() {
		Employee e = new Employee();
		e.first = "dffasf";
		e.last = "dfsff";
		return e;
	}
}
