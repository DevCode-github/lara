package app1;

public class M8 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				 for (int i = 1000 ; i < 2000 ; i++) {
					 System.out.println("loop t1 : " + i);
				 }
			}
		};
		t1.start();
		 for (int i = 2000 ; i < 3000 ; i++) {
			 System.out.println("loop main : " + i);
		 }
	}
}
