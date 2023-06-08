package pack3_Synchronization;

class Contractor extends Thread{
	String res1 = "water";
	String res2 = "sand";
	String res3 = "cement";
	public void run() {
		if(Thread.currentThread().getName().equals("contractor-1")) {
			cont1();
		}
		else if(Thread.currentThread().getName().equals("contractor-2")) {
			cont2();
		}
		else cont3();
	}
	public void cont1() {
		int water = 0;
		try {
			while(true) {
				if (water == 0) {
					synchronized(res1) {
						System.out.println("cont1 is using " + res1);
						Thread.sleep(5000);
						System.out.println("cont1 is finished " + res1);
						water++;
					}
				}
				if (water == 1) {
					synchronized(res2) {
						System.out.println("cont1 is using " + res2);
						Thread.sleep(5000);
						System.out.println("cont1 is finished " + res2);
						water++;
					}
				}
				if (water == 2) {
					synchronized(res3) {
						System.out.println("cont1 is using " + res3);
						Thread.sleep(5000);
						System.out.println("cont1 is finished " + res3);
						water++;
					}
				}
				if (water == 3) {
					System.out.println("cont1 finished mixture");
					break;
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void cont2() {
		int water = 0;
		try {
			while(true) {
				if (water == 0) {
					synchronized(res1) {
						System.out.println("cont2 is using " + res1);
						Thread.sleep(5000);
						System.out.println("cont2 is finished " + res1);
						water++;
					}
				}
				if (water == 1) {
					synchronized(res2) {
						System.out.println("cont2 is using " + res2);
						Thread.sleep(5000);
						System.out.println("cont2 is finished " + res2);
						water++;
					}
				}
				if (water == 2) {
					synchronized(res3) {
						System.out.println("cont2 is using " + res3);
						Thread.sleep(5000);
						System.out.println("cont2 is finished " + res3);
						water++;
					}
				}
				if (water == 3) {
					System.out.println("cont2 finished mixture");
					break;
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void cont3() {
		int water = 0;
		try {
			while(true) {
				if (water == 0) {
					synchronized(res1) {
						System.out.println("cont3 is using " + res1);
						Thread.sleep(5000);
						System.out.println("cont3 is finished " + res1);
						water++;
					}
				}
				if (water == 1) {
					synchronized(res2) {
						System.out.println("cont3 is using " + res2);
						Thread.sleep(5000);
						System.out.println("cont3 is finished " + res2);
						water++;
					}
				}
				if (water == 2) {
					synchronized(res3) {
						System.out.println("cont3 is using " + res3);
						Thread.sleep(5000);
						System.out.println("cont3 is finished " + res3);
						water++;
					}
				}
				if (water == 3) {
					System.out.println("cont3 finished mixture");
					break;
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
public class M6_contracotrs_problem {
	public static void main(String[] args) {
		Contractor c1 = new Contractor();
		Contractor c2 = new Contractor();
		Contractor c3 = new Contractor();
		
		c1.setName("contractor-1");
		c2.setName("contractor-2");
		c3.setName("contractor-3");
		
		c1.start();
		c2.start();
		c3.start();
	}
}
