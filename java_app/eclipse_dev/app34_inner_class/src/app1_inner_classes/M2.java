package app1_inner_classes;

public class M2 {
	int i;
	void test() {
		System.out.println("from test");
	}
	static int j;
	static void test2() {
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		System.out.println(j);
		test2();
		M2 obj = new M2();
	}
}
