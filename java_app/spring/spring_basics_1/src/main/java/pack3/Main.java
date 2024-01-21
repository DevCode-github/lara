package pack3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpAddconfig.class);
		System.out.println("-------------------------------");
		Employee e = ctx.getBean(Employee.class);
		e.sayHello();
	}
}
