package pack2_Runnable;

public class M4_lic_aic {
	public static void main(String[] args) {
		class NonStaticThread implements Runnable{		
			@Override
			public void run() {
				for (int i = 0 ; i < 200 ; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i + "lic");
				}			
			}		
		}
		//Anonymous inner class
		new Thread(){
			public void run() {
				for (int i = 200 ; i < 300 ; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i + "aic");
				}
			}
		}.start();
		//Local inner class
		new Thread(new NonStaticThread()).start();
		//main thread
		for (int i = 300 ; i < 400 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
