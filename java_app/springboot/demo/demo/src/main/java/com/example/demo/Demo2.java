package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2 {
	public static void main(String[] args) {
		SpringApplication.run(Demo2.class, args);
		System.out.println("done");
	}
	@RequestMapping("t1")
	public void test1() {
		System.out.println("from test1");
	}
	@RequestMapping("abc")
	public String test2() {
		System.out.println("from test2");
		return "<br/>i am from test2 <h1>fsf</h1>";
	}
	@RequestMapping("t3")
	public String test3() {
		System.out.println("from test3");
		return "<br/><h1><i>i am from test3</i></h1>";
	}
	@RequestMapping("t4")
	public Double test4() {
		System.out.println("from test4");
		return 20.00;
	}
	@RequestMapping("t5")
	public int[] test5() {
		System.out.println("from test5	");
		return new int[] {10,34,5};
	}
	@RequestMapping("t6")
	public List<String> test6() {
		return Arrays.asList("abc","text","hello");
	}
	@RequestMapping("t7")
	public Map<String, Integer> test7() {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 22);
		map.put("xyz", 212);
		map.put("test", 122);
		return map;
	}
	@RequestMapping("t8")
	public Person test8() {
		Person p1 = new Person();
		p1.setFirstName("abc");
		p1.setLastName("xyz");
		return p1;
	}

}
