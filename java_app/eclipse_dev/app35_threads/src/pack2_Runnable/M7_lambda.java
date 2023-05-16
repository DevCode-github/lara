package pack2_Runnable;

public class M7_lambda {
	static Runnable test1() {
		return new Runnable() {
			public void run() {
				for (int i = 0 ; i < 100 ; i++) {
					System.out.println(i);
				}
			}
		};
	}
	static Runnable test2() {
		return () -> {
			for (int i = 100 ; i < 200 ; i++) {
				System.out.println(i);
			}
		};
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(test1());
		t1.start();
		
		Thread t2 = new Thread(test2());
		t2.start();
	}
}
