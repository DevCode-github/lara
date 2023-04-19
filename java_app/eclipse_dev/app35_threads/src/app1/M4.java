package app1;
class F extends Thread{
	public void run() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("loop F : " + i);
		}
	}
}
public class M4 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.start();
		F f2 = new F();
		f2.start();
		F f3 = new F();
		f3.start();
		for (int i = 100 ; i < 00 ; i++) {
			System.out.println("loop main : " + i);
		}
	}
	
	
}
