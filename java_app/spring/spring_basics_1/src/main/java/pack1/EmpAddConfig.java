package pack1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class EmpAddConfig {
	
	@Bean(name="addres")
	public Address getAddress() {
		Address add = new Address();
		add.setHouseNo("12/M");
		add.setStreetName("BTM");
		return add;
	}
	@Bean(name="e1" , initMethod="method1", destroyMethod="method2")
	@Scope(value="prototype")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setFirstName("dev");
		emp.setLastName("kumar");
		return emp;
	}
	@Bean(name="e2")
	public Employee getEmployee1() {
		Employee emp = new Employee();
		emp.setFirstName("dev1");
		emp.setLastName("kumar1");
		return emp;
	}
	
}
