package pack2_Runnable;

class I extends Thread{
	public void run() {
		for(int i = 0 ; i < 500 ; i++) {
			System.out.println(i);
		}
	}
}
public class M15_join {
	public static void main(String[] args) {
		I i1 = new I();
		i1.start();
		try {
			/*
			 * main will be executing only when child execution is finished. 
			 */
			i1.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
	}
}