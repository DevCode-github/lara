package com.example.jpademo.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rep")
public class EmployeeController {
	
	@Autowired
	private EmployeeRespository employeeRepository;
	
	@PostMapping("emp")
	public Employee save(@RequestBody Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}
	@PostMapping("allemp")
	public String allEmployee(@RequestBody Company company) {
		employeeRepository.saveAll(company.getEmployee());
		return "success ... all saved";
	}
	@GetMapping("read/{empId}")
	public Employee read1(@PathVariable String empId) {
		return employeeRepository.findById(empId).get();
	}
	@GetMapping("read2")
	public Iterable<Employee> read2() {
		return employeeRepository.findAll();
	}
	@PostMapping("read3")
	public Iterable<Employee> read3(){
		List<String> list = Arrays.asList("emp1", "emp2");
		return employeeRepository.findAllById(list);
	}
	@DeleteMapping("delete")
	public String delete(@RequestParam String id) {
		employeeRepository.deleteById(id);
		return id + " deleted successfully";
	}
	@DeleteMapping("deleteAll")
	public String delete() {
		employeeRepository.deleteAll();
		return "deleted all successfully";
	}
	@DeleteMapping("deleteAllid")
	public String delete(@RequestBody IdList idlist) {
		employeeRepository.deleteAllById(idlist.getIdList());
		return "deleted all successfully by id";
	}
	@GetMapping("read4/{firstName}")
	public Iterable<Employee> read4(@PathVariable String firstName){
		return employeeRepository.findAllByFirstName(firstName);
	}
	@GetMapping("read5/{age}")
	public Iterable<Employee> read5(@PathVariable Integer age){
		return employeeRepository.findAllByAge(age);
	}
	@GetMapping("read6/{email}")
	public Iterable<Employee> read6(@PathVariable String email){
		return employeeRepository.findByEmail(email);
	}
	//30/6
	@GetMapping("read7/{firstName}/{age}")
	public Iterable<Employee> read7(@PathVariable String firstName, @PathVariable Integer age) {
		return employeeRepository.findByFirstNameOrAge(firstName, age);
	}
	@GetMapping("read8/{firstName}/{email}")
	public Iterable<Employee> read8(@PathVariable String firstName, @PathVariable String email) {
		return employeeRepository.findByFirstNameOrEmail(firstName, email);
	}
	@GetMapping("read9/{firstName}/{email}")
	public Iterable<Employee> read9(@PathVariable String firstName, @PathVariable String email) {
		return employeeRepository.findByFirstNameAndEmail(firstName, email);
	}
	@GetMapping("read10/{firstName}/{age}")
	public Iterable<Employee> read10(@PathVariable String firstName, @PathVariable Integer age) {
		return employeeRepository.findByFirstNameAndAge(firstName, age);
	}
	@GetMapping("read11/{age}")
	public Iterable<Employee> read11(@PathVariable Integer age) {
		return employeeRepository.findAllByAgeGreaterThan(age);
	}
	@GetMapping("read12/{firstName}")
	public Iterable<Employee> read12(@PathVariable String firstName) {
		return employeeRepository.findAllByFirstNameLike("%" + firstName);
	}
	@GetMapping("read13/{firstName}")
	public Iterable<Employee> read13(@PathVariable String firstName) {
		return employeeRepository.readByFirstName(firstName);
	}
	@GetMapping("read14/{firstName}/{lastName}")
	public Iterable<Employee> read14(@PathVariable String firstName, @PathVariable String lastName) {
		return employeeRepository.readByFirstNameOrLastName(firstName,lastName);
	}
	@GetMapping("read15/{firstName}/{lastName}")
	public Iterable<Employee> read15(@PathVariable String firstName, @PathVariable String lastName){
		return employeeRepository.readByArgNumber(firstName, lastName);
	}
	@GetMapping("read16")
	public Iterable<EmployeeDto> read16() {
		return employeeRepository.readEmployeeDto();
	}
}
