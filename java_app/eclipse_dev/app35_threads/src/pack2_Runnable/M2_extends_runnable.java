package pack2_Runnable;

class B implements Runnable{
	public void run() {
		for (int i = 0 ; i < 500 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M2_extends_runnable {
	public static void main(String[] args) {
		B b1 = new B();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.start();
		t2.start();
		t3.start();
		for (int i = 500 ; i < 600 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
