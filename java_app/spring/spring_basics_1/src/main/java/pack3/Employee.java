package pack3;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	public Address add;
	
	public void sayHello() {
		System.out.println("from emp ; " + add.display());
	}
	
}
