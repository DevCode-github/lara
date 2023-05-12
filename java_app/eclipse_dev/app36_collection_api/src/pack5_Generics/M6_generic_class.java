package pack5_Generics;

@SuppressWarnings("hiding")
class F<A>{
	void test(A arg) {
		System.out.println("from test(A)");
		System.out.println(arg);
	}
}
public class M6_generic_class {
	public static void main(String[] args) {
		F<String> f1 = new F<String>();
		f1.test("abc");
		F<Integer> f2 = new F<Integer>();
		f2.test(300);
		F<Double> f3 = new F<Double>();
		f3.test(3.4);
	}
}
