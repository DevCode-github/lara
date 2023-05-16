package pack2_Runnable;

public class M5_aic_runnable {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0 ; i < 100 ; i++) {
					System.out.println(i);
				}
			}
		}).start();
		for (int i = 0 ; i <= 100 ; i++) {
			System.out.println(i);
		}
	}
}
