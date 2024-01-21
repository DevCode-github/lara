package com.self.self;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEntityController {
	@GetMapping("self")
	public ResponseEntity<String> test1() {
		return ResponseEntity.ok().header("content-disposition", "attachment;filename=b.text").body("i M body");
	}
	@GetMapping("self1/{file}")
	public ResponseEntity<String> test2(@PathVariable String file) {
		try {
			FileReader fin = new FileReader(file);
		}
		catch(FileNotFoundException ex) {
			return ResponseEntity.badRequest().body("NO file Found");
		}
		return ResponseEntity.ok().body("found");
	}
	@GetMapping("self2")
	public ResponseEntity<String> test3() {
		return ResponseEntity.ok().header("content-type", "text/html").body("<script>document.querySelector('body').style.backgroundColor = 'red';</script>");
	}
	int i;
	@GetMapping("self3")
	public ResponseEntity<String> test4() {
		i++;
		return ResponseEntity.ok().header("refresh", "").body("this is res " + i);
	}
}
