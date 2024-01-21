package java8_interface;

interface Sample{
	public void m1();
	default void m2() {
		System.out.println("interface implementatio of m2 method");
	}
}
class Demo implements Sample{
	public void m1() {
		System.out.println("m1() implemented in demo");
	}
}
class Demo1 extends Demo{
	public void m2() {
		System.out.println("m2() overrided in Demo1");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.m1();
		d1.m2();
		Demo1 d2 = new Demo1();
		d2.m2();
		Sample s1 = (Sample) new Demo1();
		s1.m2();
	}
}
