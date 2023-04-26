package app1_inner_classes;

public class M9 {

	public static void main(String[] args) {
		class A {
			static int i;
			static void test() {
				System.out.println(i);
			}
			private void test2() {
				System.out.println(i);
			}
		}
		A.test();
		A.i = 10;
		A a1 = new A();
		a1.test2();
	}

}
