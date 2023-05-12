package pack5_Generics;

@SuppressWarnings("hiding")
interface H<M>{
	void test1(M arg);
    M test2(M arg);
}
class I implements H<String>{
	public void test1(String arg) {
		System.out.println("from B-test1");
	}
	public String test2(String arg) {
		System.out.println("from B-test2");
		return arg;
	}
	public static void main(String[] args) {
		
	}
}
class J implements H<Integer>{
	public void test1(Integer arg) {
		System.out.println("from C-test1");
	}
	public Integer test2(Integer arg) {
		System.out.println("from C-test2");
		return arg;
	}
	public static void main(String[] args) {
		
	}
}
class K<X> implements H<X>{
	X field;
	public void test1(X arg) {
		System.out.println("from D-test1");
	}
	public X test2(X arg) {
		System.out.println("from D-test2");
		return field;
	}
	public static void main(String[] args) {
		
	}
}
public class M8_Generic_Interface {
	public static void main(String[] args) {
		I b1 = new I();
		J c1 = new J();
		K<Double> d1 = new K<Double>();
		b1.test1("abc");
		System.out.println(b1.test2("abc"));
		c1.test1(4);
		System.out.println(c1.test2(4));
		d1.test1(6.7);
		System.out.println(d1.test2(6.7));
	}
}