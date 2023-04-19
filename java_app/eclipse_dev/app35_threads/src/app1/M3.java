package app1;

class B extends Thread{
	public void run() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("loop B : " + i);
		}
	}
}
class C extends Thread{
	public void run() {
		for (int i = 100 ; i < 200 ; i++) {
			System.out.println("loop C : " + i);
		}
	}
}
class D extends Thread{
	public void run() {
		for (int i = 200 ; i < 300 ; i++) {
			System.out.println("loop D : " + i);
		}
	}
}

public class M3 {
	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		b1.start();
		c1.start();
		d1.start();
		for (int i = 3 ; i < 400 ; i++) {
			System.out.println("loop main : " + i);
		}
	}

}
