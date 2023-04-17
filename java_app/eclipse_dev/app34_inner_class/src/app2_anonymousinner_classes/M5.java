package app2_anonymousinner_classes;
public class M5 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A() {};
		A a3 = new A() {
			
		};
		A a4 = new A() {};
		A a5 = new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
		};
		A a6 = new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		};
		A a7 = new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		};
		a1.test1();
		a5.test1();
		a6.test2();
		a7.test1();
		a7.test2();		
	}
}
