package pack2_Runnable;

public class M3_innerclass{
	static class StaticThread implements Runnable{
		@Override
		public void run() {
			for (int i = 0 ; i < 100 ; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}		
	}
	class NonStaticThread implements Runnable{		
		@Override
		public void run() {
			for (int i = 100 ; i < 200 ; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}			
		}		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new M3_innerclass().new NonStaticThread());
		Thread t2 = new Thread(new M3_innerclass.StaticThread());
		t1.start();
		t2.start();
		for (int i = 300 ; i < 400 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}		
	}
}

