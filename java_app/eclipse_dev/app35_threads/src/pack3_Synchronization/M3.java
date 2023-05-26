package pack3_Synchronization;

class C{
	static synchronized void test() {
		Thread t1 = Thread.currentThread();
		for (int i = 1 ; i <= 1000 ; i++) {
			System.out.println(t1.getName() + " : " + i);
		}
	}
}
class M3Thread1 extends Thread{
	public void run() {
		C.test();
	}
}
class M3Thread2 extends Thread{
	public void run() {
		C.test();
	}
}
public class M3 {
	public static void main(String[] args) {
		M3Thread1 t1 = new M3Thread1();
		M3Thread2 t2 = new M3Thread2();
		t1.start();
		t2.start();
	}
}
