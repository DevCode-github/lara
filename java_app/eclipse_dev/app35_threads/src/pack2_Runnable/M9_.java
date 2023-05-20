package pack2_Runnable;

class C extends Thread{
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M9_ {
	public static void main(String[] args) {
		C a1 = new C();
		a1.start();
		System.out.println("------------");
		a1.run();
		System.out.println("------------");
		a1.run();
	}
}
