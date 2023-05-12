package pack5_Generics;

class A{
	int i;
}
public class M1 {
	public static void main(String[] args) {
		/*
		 * Object to object is not changing.
		 */
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		a1.i = 100;
		a2.i = 200;
		a3.i = 400;
		a4.i = 600;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println(a4.i);
	}
}
