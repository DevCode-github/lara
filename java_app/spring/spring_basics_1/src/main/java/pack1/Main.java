package pack1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpAddConfig.class);
//		System.out.println("----------------");
//		Employee emp = ctx.getBean("e1",Employee.class);
//		System.out.println(emp.getFirstName());
//		System.out.println(emp.getLastName());
//		Address add = emp.getAddress();
//		System.out.println(add.getHouseNo());
//		System.out.println(add.getStreetName());
//		System.out.println("----------------");
		Employee emp1 = ctx.getBean("e2",Employee.class);
		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getLastName());
		Address add1 = emp1.getAddress();
		System.out.println(add1.getHouseNo());
		System.out.println(add1.getStreetName());
		ctx.close();
	}
}
