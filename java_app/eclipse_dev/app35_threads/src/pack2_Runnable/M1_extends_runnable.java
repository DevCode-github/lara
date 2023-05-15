package pack2_Runnable;

class A implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("run : " + i);
		}
	}
}
public class M1_extends_runnable {
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
	}
}
