package pack2_Runnable;

public class M16_sleep {
	public static void main(String[] args) {
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
