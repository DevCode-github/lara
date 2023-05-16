package pack2_Runnable;

public class M6_lambda {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 1; i <= 100 ; i++) {
				System.out.println(i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//can also be written
		Thread t2 = new Thread(() -> {
			for (int i = 200; i <= 300 ; i++) {
				System.out.println(i);
			}
		});
		t2.start();
		
		for (int i = 300 ; i <= 400 ; i++) {
			System.out.println(i);
		}
	}
}
