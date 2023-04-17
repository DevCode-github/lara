package app1_inner_classes;

public class M7 {

	public static void main(String[] args) {
		class A {
			void test() {
				System.out.println("test");
			}
		}
		A a1 = new A();
		a1.test();
	}

}
