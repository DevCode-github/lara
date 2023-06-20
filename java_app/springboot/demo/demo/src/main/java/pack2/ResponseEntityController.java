package pack2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
	@GetMapping("re1")
	public ResponseEntity<String> test1(){	
		System.out.println("from test1");
		return ResponseEntity.ok("i am from test1");
	}
	@GetMapping("re2")
	public ResponseEntity<Integer> test2(){
		System.out.println("from test2");
		return ResponseEntity.ok(400);
	}
	@GetMapping("re3")
	public ResponseEntity<String[]> test3(){
		System.out.println("from test3");
//		return ResponseEntity.ok().body(new String[] {"abc", "xyz"});
		return ResponseEntity.ok(new String[] {"abc", "xyz"});
	}
	@GetMapping("re4")
	public ResponseEntity<Integer[]> test4(){
		System.out.println("from test4");
		return ResponseEntity.ok().body(new Integer[] {3,3,4,6});
	}
	@GetMapping("re5/{age}")
	public ResponseEntity<String> test5(@PathVariable Integer age){
		System.out.println("from test5");
		if (age <= 0) {
			return ResponseEntity.badRequest().body("age should be greater than 0");
		}
		return ResponseEntity.ok().body("proper age");
	}
	@GetMapping("re6/{yearOfBirth}")
	public ResponseEntity<String> test6(@PathVariable Integer yearOfBirth){
		System.out.println("from test6");
		if (yearOfBirth >= 2024 || yearOfBirth < 1999) {
			return ResponseEntity.badRequest().body("age should be greater than 2024");
		}
		return ResponseEntity.ok().body("proper yearOfBirth");
	}
	@GetMapping("re7/{file}")
	public ResponseEntity<String> test7(@PathVariable String file){
		System.out.println("from test7");
		try{
			FileReader fin = new FileReader(file);
		}
		catch(IOException ex) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.badRequest().body("proper file");
	}
	@GetMapping("re8")
	public ResponseEntity<String> test8(){
		//By default content type is html
		return ResponseEntity.ok().header("content-type", "text/html").body("<h1>This is the results</h1>");
	}
	@GetMapping("re9")
	public ResponseEntity<String> test9(){
		//By default content type is html
		return ResponseEntity.ok().header("content-type", "text/plain").body("<h1>This is the results</h1>");
	}
	int count;
	@GetMapping("re10")
	public ResponseEntity<String> test10(){
		count++;
		return ResponseEntity.ok().header("refresh", "4").body("<h1>This is the results count: " + count + "</h1>");
	}
	@GetMapping("re11")
	public ResponseEntity<String> test11(){
		return ResponseEntity.ok().header("content-disposition", "attachment;filename=a.txt").body("This is the results count");
	}
	@GetMapping("re12")
	public ResponseEntity<String> test12(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "text/plain");
		headers.add("refresh","5");
		count++;
		return ResponseEntity.ok().headers(headers).body("<h1> this is the results : " + count + "</h1>");
	}
	@GetMapping("re13")
	public ResponseEntity<String> test13(){
		ResponseEntity re = new ResponseEntity("success", HttpStatus.OK);
		return re;
	}
	@GetMapping("re14")
	public ResponseEntity<ArrayList<Integer>> test14(){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		ResponseEntity re = new ResponseEntity(list, HttpStatus.OK);
		return re;
		
	}
	@GetMapping("re15")
	public ResponseEntity<ArrayList<Integer>> test15(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("refresh", "5");
		headers.add("context-type", "text/html");
		count++;
		ResponseEntity re = new ResponseEntity("<h1>count : " + count + "</h1>", headers, HttpStatus.BAD_GATEWAY);
		return re;
	}
}
