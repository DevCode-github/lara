package pack2_Runnable;

class G extends Thread{
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
	}
}
public class M13_setDaemon {
	public static void main(String[] args) {
		G g1 = new G();
		g1.start();
		System.out.println("done");
	}
}