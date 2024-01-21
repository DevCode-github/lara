package java8_interface;

interface Sample1{
	public void m1();
	public static void m2() {
		System.out.println("interface implementation of m2");
	}
}

class Demo2 implements Sample1{
	public void m1() {
		System.out.println("m1() implemented in Demo");
	}
	protected int m2(int i) {
		return 0;
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.m1();
		d1.m2(0);
		Sample1.m2();
	}
}
