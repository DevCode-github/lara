package pack5_Generics;

interface N<P>{
	P test1();
	P test2(P arg);
	void test3(P arg1, P arg2, int i);
	P test5(String s1, P arg);
	P test6(String s1);
}
class L implements N<K<String>>{
	K<String> k1;
	public K<String> test1() {
		System.out.println("from L-test1");
		return k1;
	}
	public K<String> test2(K<String> obj) {
		System.out.println("from L-test2");
		return obj;
	}
	public void test3(K<String> o1, K<String> o2, int j) {
		System.out.println("from L-test3");
	}
	public K<String> test5(String s1, K<String> o1) {
		System.out.println("from L-test5");
		return o1;
	}
	public K<String> test6(String s) {
		System.out.println("from L-test6");
		return k1;
	}
}
class M<X> implements N<K<X>>{
	K<X> k1 = new K<X>();
	X field;
	public K<X> test1() {
		System.out.println("from M-test1");
		k1.test1(field);
		return k1;
	}
	public K<X> test2(K<X> obj) {
		System.out.println("from M-test2");
		return obj;
	}
	public void test3(K<X> o1, K<X> o2, int j) {
		System.out.println("from M-test3");
	}
	public K<X> test5(String s1, K<X> o1) {
		System.out.println("from M-test5");
		return o1;
	}
	public K<X> test6(String s) {
		System.out.println("from M-test6");
		return k1;
	}
}
public class M9_CE_Generic_Interface {
	public static void main(String[] args) {
		L l1 = new L();
		M<Integer> m1 = new M<Integer>();
		K<String> k1,k2;
		k1 = k2 = null;
		K<Integer> k3,k4;
		k3 = k4 = null;
		l1.test1();
		l1.test2(new K<String>());
		l1.test3(k1, k2, 0);
		l1.test5("", k2);
		l1.test6("");
		m1.test1();
		m1.test2(k4);
		m1.test3(k3, k4, 0);
		m1.test5("", k4);
		m1.test6("");
		
	}
}
