package pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String firstName;
	private String lastName;
//	@Autowired
	private Address address;
//	@Autowired
	public Employee(@Qualifier("address") Address add) {
		this.address = add;
	}
	public Employee() {
		System.out.println("employee obj created");
	}
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
//	public Employee(Address address1) {
//		System.out.println("employee obj created");
//		this.address = address1;
//	}
	public Employee(String firstName1, String lastName1, Address address1) {
		System.out.println("employee obj created");
		this.firstName = firstName1;
		this.lastName = lastName1;
		this.address = address1;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
