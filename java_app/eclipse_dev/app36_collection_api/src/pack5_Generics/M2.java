package pack5_Generics;

class B{
	void test(String s1) {
		System.out.println("test :" + s1);
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		b1.test("abc");
		b2.test("xyz");
		b3.test("hello");
		b4.test("test");
	}
}
