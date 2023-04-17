package app2_anonymousinner_classes;

public class M2 {
	public static void main(String[] args) {
		A a1 = new A() {
			void test1() {
				System.out.println("from inner class test1");
			}
		};
		a1.test1();
		a1.test2();
	}

}
