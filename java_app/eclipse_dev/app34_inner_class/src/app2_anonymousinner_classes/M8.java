package app2_anonymousinner_classes;

public class M8 {
	static void method1(B b1) {
		b1.test1();
		b1.test2();
	}
	public static void main(String[] args) {
		B b1 = new B() {
			void test1() {
				System.out.println("Aic-test1");
			}
		};
		method1(b1);
		System.out.println("-----------------");
		method1(new B() {
			void test1(){
				System.out.println("Aic-test1");
			}
		});
		System.out.println("------------------");
		method1(new B() {
			void test1(){
				System.out.println("Aic-test1");
			}
			void test2() {
				System.out.println("Aic-test2");
			}
		});
		
	}
}