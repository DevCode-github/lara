package pack2_Runnable;

class E extends Thread{
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M11_setName {
	public static void main(String[] args) {
		E e1 = new E();
		e1.setName("xyz");
		e1.start();
		System.out.println("done");
	}
}

