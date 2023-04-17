package app2_anonymousinner_classes;

public class M3 {
	public static void main(String[] args) {
		A a1 = new A() {
			void test2() {
				System.out.println("from inner class test2");
			}
		};
		a1.test1();
		a1.test2();
	}
}
