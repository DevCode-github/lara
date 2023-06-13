package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("s1")
	public String Service1() {
		return "hello from hello1 api";
	}
	
	@RequestMapping("s2/{arg}")
	public String Service2(@PathVariable String arg) {
		return "<h1 style='color: red'>this is the input: " + arg + "</h1>";
	}
	@RequestMapping("s3/{arg1}/{param}")
	public String Service3(@PathVariable String arg1, @PathVariable String param) {
		return "<h1 style='background-color: red'>this is the input: " + arg1 + " "+ param + "</h1>";
	}
	@RequestMapping("s4/{arg1}/{param}/{p1}")
	public String Service4(@PathVariable String arg1, @PathVariable String param, @PathVariable String p1) {
		return "<h1 style='background-color: red'>this is the input: " + arg1 + " "+ param + "p1" + "</h1>";
	}
	@RequestMapping("s5/firstName/{firstName}/lastName/{lastName}")
	public String Serivce5(@PathVariable String firstName, @PathVariable String lastName) {
		return "<h1 style='background-color: red; color: white;	'>firstName: " + firstName + " lastName: "+ lastName + "</h1>";
	}
	
	@RequestMapping("s6/{param1}")
	public String service6(@PathVariable Integer param1) {
		System.out.println("param1");
		return "parameter : " + param1;
	}
	@RequestMapping("s7/{param1}")
	public String service7(@PathVariable Integer param1) {
		int i = (param1/(param1-9));
		return "parameter : " + i;
	}
	@RequestMapping("s8/{param1}")
	public String service8(@PathVariable Integer param1) {
		System.out.println("service8: " + param1);
		return "<script>console.log('hello')</script>" ;
	}
	@RequestMapping("s9")
	public String service9(@PathVariable(required=false) Integer param1) {
		System.out.println("service8: " + param1);
		return param1 + "<br>"+"<script>console.log('from s9')</script>" ;
	}
	
	//mapping url identifier and method argument identifier
	@RequestMapping("s10/{param1}")
	public String service10(@PathVariable("param1") String firstName) {
		return firstName + "<br>"+"<script>console.log('from s10')</script>" ;
	}
	@RequestMapping("s11/{param1}")
	public String service11(@PathVariable(value="param1") String firstName) {
		return firstName + "<br>"+"<script>console.log('from s11')</script>" ;
	}
	@RequestMapping("s12/{param1}")
	public String service12(@PathVariable(name="param1") String firstName) {
		return firstName + "<br>"+"<script>console.log('from s12')</script>" ;
	}
}
	