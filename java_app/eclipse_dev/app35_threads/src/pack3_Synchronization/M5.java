package pack3_Synchronization;

class Person1 extends Thread{
	String res1 = "knowledge";
	String res2 = "Money";
	public void run() {
		if(Thread.currentThread().getName().equals("Teacher")) {
			teacherAccRes();
		}
		else {
			studentAccRes();
		}
	}
	public void teacherAccRes() {
		try {
			while(true) {
				synchronized(res1) {
					System.out.println("Teacher acquired and locked"+res1+" using");
					Thread.sleep(5000);
					System.out.println("finished");
				}
				synchronized(res2) {
					System.out.println("Teacher acquired and locked"+res2+" using");
					Thread.sleep(5000);
					System.out.println("finished");
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void studentAccRes() {
		try {
			while(true) {
				synchronized(res1) {
					System.out.println("Student acquired and locked"+res1+" using");
					Thread.sleep(5000);
					System.out.println("finished");
				}
				synchronized(res2) {
					System.out.println("Student acquired and locked"+res2+" using");
					Thread.sleep(5000);
					System.out.println("finished");
				}
				
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		
		p1.setName("Teacher");
		p2.setName("Student");
		
		p2.start();
		p1.start();
	}
}
