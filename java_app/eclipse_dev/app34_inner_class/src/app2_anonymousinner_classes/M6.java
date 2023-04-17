package app2_anonymousinner_classes;

public class M6 {

	public static void main(String[] args) {
//		B b1 = new B();
		B b2 = new B() {
			void test1() {
				System.out.println("Aic-test1");
			}
		};
		b2.test1();
		b2.test2();
	}

}
