package pack2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class M2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		Employee employee = ctx.getBean("emp", Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		Address add = employee.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		ctx.close();
	}
}
