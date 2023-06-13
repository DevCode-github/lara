package com.example.demo;

import java.util.List;

class Address{
	private String houseNo;
	private String streetName;
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getHouseNo() {
		return this.houseNo;
	}
	public String getStreetName() {
		return this.streetName;
	}
}
public class Customer {
	private String firstName;
	private String lastName;
	private Integer age;
	private String[] emailIds;
	private List<Integer> marks;
	private Address address;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String[] getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
/*
 {
 "firstName" : "abc",
 "lastName" : "xyz",
 "age" : 22,
 "emailIds" : ["a@a.com", "a@b.com", "a@c.com"],
 "marks" : [90,100,20,45],
 "address" : {
 	"housNo" : "123/m",
 	"streetName" : "btm"
 	}
 }
 */
