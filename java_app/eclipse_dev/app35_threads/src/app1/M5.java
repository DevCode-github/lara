package app1;

public class M5 {
	static class A extends Thread {
		public void run() {
			for (int i = 0 ; i < 1000 ; i++) {
				System.out.println("loop A : " + i);
			}
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for (int i = 1000 ; i < 2000 ; i++) {
			System.out.println("loop main : " + i);
		}
	}
}
