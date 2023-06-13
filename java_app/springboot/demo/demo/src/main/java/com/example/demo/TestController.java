package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("r1")
	public String test1(@RequestParam String param1) {
		System.out.println("param1 : " + param1);
		return "this is param1 : " + param1;
		//localhost:9090/r1?param1=abc
	}
	
	@RequestMapping("r2")
	public String test2(@RequestParam String firstName, @RequestParam Integer age) {
		return firstName + " " + age + "<br>"+"<script>console.log('from TestController r2')</script>" ;
		//localhost:9090/r1?firstName=abc&age=23
	}
	
	@RequestMapping("r3")
	public String test3(@RequestParam String firstName, @RequestParam Integer age, @RequestParam String lastName) {
		return firstName + " " + age + " "+ lastName + "<br>"+"<script>console.log('from TestController r3')</script>" ;
		//localhost:9090/r1?firstName=abc&age=23&lastName=kumar
	}
	@RequestMapping("r4")
	public String test4(@RequestParam String firstName) {
		return firstName + "<br>"+"<script>console.log('from TestController r4')</script>" ;
		//localhost:9090/r1?hello=abc
	}
	@RequestMapping("r5")
	public String test5(@RequestParam("hello") String firstName) {
		return firstName + "<br>"+"<script>console.log('from TestController r5')</script>" ;
		//localhost:9090/r1?hello=abc
	}
	@RequestMapping("r6")
	public String test6(@RequestParam(value="hello") String firstName) {
		return firstName + "<br>"+"<script>console.log('from TestController r6')</script>" ;
		//localhost:9090/r1?hello=abc
	}
	@RequestMapping("r7")
	public String test7(@RequestParam(name="hello") String firstName) {
		return firstName + "<br>"+"<script>console.log('from TestController r7')</script>" ;
		//localhost:9090/r1?hello=abc
	}
	@RequestMapping("r8")
	public String test8(@RequestParam(required=false) String firstName) {
		return firstName + "<br>"+"<script>console.log('from TestController r8')</script>" ;
		//localhost:9090/r1?hello=abc
	}
	
}
