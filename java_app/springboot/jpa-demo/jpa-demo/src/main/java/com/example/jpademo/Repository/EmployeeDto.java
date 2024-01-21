package com.example.jpademo.Repository;

public class EmployeeDto {
	private String firstName;
	private String lastName;
	private Integer age;
	private String address;
	private Integer salary;
	public EmployeeDto(String firstName, String lastName, Integer age, String address, Integer salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public Integer getSalary() {
		return salary;
	}

}
