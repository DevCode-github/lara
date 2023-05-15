package pack1;

class A extends Thread{	//inbuilt class
	public void run() {	//inherited method overriding
		for (int i = 1; i < 1000 ; i++) {
			System.out.println("loop1: " + i);
		}
	}
}
public class M2_Thread_start {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for (int i = 4000; i < 5000; i++) {
			System.out.println("loop2: " + i);
		}
	}
}
