package pack2_Runnable;

class F extends Thread{
	F(){}
	F(String s1){
		super(s1);
	}
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M12_setName {
	public static void main(String[] args) {
		F f1 = new F("hello");
		f1.start();
		System.out.println("done");
	}
}

