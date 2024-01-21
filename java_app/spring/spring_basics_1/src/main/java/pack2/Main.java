package pack2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpAddConfig.class);
		Employee e = ctx.getBean("e",Employee.class);
		System.out.println(e.first);
		System.out.println(e.last);
		Address add = e.getAdd();
		System.out.println(add.zip);
		System.out.println(add.street);
	}
	
}
