package com.example.jpademo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person_table")
public class Person {
	private int id;
	@Column(name="person_name")
	private String firstName;
	@Id
	private String lastName;
	@Column(nullable=false, unique=true)
	private Integer age;
}
