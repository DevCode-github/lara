package app2_anonymousinner_classes;

public class M7 {
	static void test1(A obj) {
		obj.test1();
		obj.test2();
	}
	public static void main(String[] args) {
		test1(new A());
		System.out.println("------------");
		test1(new A() {
			void test1() {
				System.out.println("Aic-test1");
			}
		});
		System.out.println("------------");
		test1(new A() {
			void test2() {
				System.out.println("Aic-test2");
			}
		});
		System.out.println("------------");
		test1(new A() {			
			void test1() {
				System.out.println("Aic-test1");
			}
			void test2() {
				System.out.println("Aic-test2");
			}
		});
	}
}
