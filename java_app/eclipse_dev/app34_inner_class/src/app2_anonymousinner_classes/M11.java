package app2_anonymousinner_classes;

import java.util.Iterator;

public class M11 {
	public static void main(String[] args) {
//		E e1 = new E();
		E e2 = new E() {
			public void test1() {
				System.out.println("E - test1");
			}
			public void test2() {
				System.out.println("E-test2");
			}
		};
		e2.test1();
		e2.test2();
		for (dfd;;){
			
		}
	}
}
