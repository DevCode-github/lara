package pack1;

import java.util.HashSet;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PersonController {
	static HashSet<Person> p;
	public static void main(String[] args) {
		SpringApplication.run(PersonController.class,args);
		System.out.println("done");
		p = new HashSet<>();
	}
	@RequestMapping("saveP")
	public String save(@RequestBody Person person) {
		if(p.add(person)) return "added";
		return "username already exist";
	}
	@RequestMapping("searchP")
	public String search(@RequestParam("userid") String userid) {
		Iterator<Person> it = p.iterator();
		while(it.hasNext()) {
			Person obj = it.next();
			if (obj.getUserId().equals(userid)) return obj.toString();
		}
		return "not present in record";
	}
}
