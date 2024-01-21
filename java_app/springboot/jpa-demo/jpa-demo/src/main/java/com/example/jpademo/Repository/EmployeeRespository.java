package com.example.jpademo.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRespository extends CrudRepository<Employee, String>{
	public Iterable<Employee> findAllByFirstName(String firstName);
	public Iterable<Employee> findAllByAge(Integer age);
	public Iterable<Employee> findAllByLastName(String lastName);
	public Iterable<Employee> findByEmail(String email);
	//30/6
	public Iterable<Employee> findByFirstNameOrAge(String firstName, Integer age);
	public Iterable<Employee> findByFirstNameOrEmail(String firstName, String email);
	public Iterable<Employee> findByFirstNameOrLastName(String firstName, String lastName);
	public Iterable<Employee> findByFirstNameAndAge(String firstName, Integer age);
	public Iterable<Employee> findByFirstNameAndLastName(String firstName, String lastName);
	public Iterable<Employee> findByFirstNameAndEmail(String firstName, String email);
	public Iterable<Employee> findAllByAgeGreaterThan(Integer age);
	public Iterable<Employee> findAllByFirstNameLike(String firstName);
	@Query("select e from Employee e where e.firstName = :arg_name")
	public Iterable<Employee> readByFirstName(String arg_name);
	@Query("select e from Employee e where e.firstName = :arg1_name or e.lastName = :arg2_name")
	public Iterable<Employee> readByFirstNameOrLastName(String arg1_name, String arg2_name);
	@Query("select e from Employee e where e.firstName = ?1 or e.lastName = ?2")
	public Iterable<Employee> readByArgNumber(String arg1, String arg2);
	@Query("select new com.example.jpademo.Repository.EmployeeDto(e.firstName,e.lastName,e.age,e.address,e.salary) from Employee e")
	public Iterable<EmployeeDto> readEmployeeDto();
	
	
}
