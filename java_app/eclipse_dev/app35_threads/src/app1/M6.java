package app1;

public class M6 {
	public static void main(String[] args) {
		 class A extends Thread {
			 public void run() {
				 for (int i = 0 ; i < 1000 ; i++) {
					 System.out.println("loop A :" + i);
				 }
			 }
		 }
		 A a1 = new A();
		 a1.start();
		 for (int i = 2000 ; i < 3000 ; i++) {
			 System.out.println("loop main : " + i);
		 }
	}
}
