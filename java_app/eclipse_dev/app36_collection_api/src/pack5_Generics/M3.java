package pack5_Generics;

class C{
	boolean test() {
		System.out.println("from test");
		return true;
	}
}
@SuppressWarnings({"unused"})
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		C c4 = new C();
		boolean b1 = c1.test();
		boolean b2 = c2.test();
		boolean b3 = c3.test();
		boolean b4 = c4.test();
		System.out.println("done");
	}
}
