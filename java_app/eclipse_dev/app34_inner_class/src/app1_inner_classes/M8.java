package app1_inner_classes;

public class M8 {

	public static void main(String[] args) {
		final int i = 10;
		int j = 10;
		class A {
			void test() {
				System.out.println(i);
				System.out.println(j);//if j is modifying then j cannot be used in local inner class.
			}
		}
		A a1 = new A();
		a1.test();
//		j = 20;
		a1.test();
	}

}
