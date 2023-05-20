package pack2_Runnable;

class D extends Thread{
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M10_setPriority {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		main.setPriority(3);
		D d1 = new D();
		d1.start();		
		System.out.println(main.getPriority());
	}
}
