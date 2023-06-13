package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("emp")
	public Employee save(@RequestBody Employee employee) {
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		return employee;
	}

}

/**
 * {
 * "fistName": "abc",
 * "lastName"" "xyz",
 * "age": 22
 * }
 */
