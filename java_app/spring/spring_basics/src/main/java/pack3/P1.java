package pack3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersonManager.class);
		Person obj = ctx.getBean("p1", Person.class);
		System.out.println(obj.getSomeDesc());
		ctx.close();
	}
}
