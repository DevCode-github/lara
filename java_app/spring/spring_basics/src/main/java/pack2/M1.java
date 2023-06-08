package pack2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class M1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersonManager.class);
		Person person = ctx.getBean("personObj", Person.class);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		ctx.registerShutdownHook();
	}
}
