package app1_inner_classes;

public class M5 {
	class A {}
	static class B {}
	public static void main(String[] args) {
		A a1 = null;
		B b1 = null;
		b1 = new B();
		M5 obj = new M5();
		a1 = obj.new A();

	}

}
