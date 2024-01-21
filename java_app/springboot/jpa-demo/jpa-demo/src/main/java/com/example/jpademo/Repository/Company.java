package com.example.jpademo.Repository;

import java.util.List;

public class Company {
	private List<Employee> employees;
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public List<Employee> getEmployee(){
		return employees;
	}

}
