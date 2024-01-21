package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpAdd {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println("--------------byName-------------------");
		Employee emp = ctx.getBean("e1",Employee.class);
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		Address add = emp.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		
		System.out.println("-------------constructor--------------------");
		Employee emp1 = ctx.getBean("e2",Employee.class);
		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getLastName());
		Address add1 = emp1.getAddress();
		System.out.println(add1.getHouseNo());
		System.out.println(add1.getStreetName());
		

		System.out.println("------------constructor arg---------------------");
		Employee emp3 = ctx.getBean("e4",Employee.class);
		System.out.println(emp3.getFirstName());
		System.out.println(emp3.getLastName());
		Address add3 = emp3.getAddress();
		System.out.println(add3.getHouseNo());
		System.out.println(add3.getStreetName());

//		System.out.println("------------bytype---------------------");
//		Employee emp2 = ctx.getBean("e3",Employee.class);
//		System.out.println(emp2.getFirstName());
//		System.out.println(emp2.getLastName());
//		Address add2 = emp2.getAddress();
//		System.out.println(add2.getHouseNo());
//		System.out.println(add2.getStreetName());
		ctx.registerShutdownHook();
		ctx.close();
	}
}
