package pack3_Synchronization;

class Person extends Thread{
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
			synchronized(res1) {
				System.out.println("Teacher acquired and locked"+res1);
				Thread.sleep(5000);
				synchronized(res2) {
					System.out.println("Teacher acquired and locked"+res2);
					Thread.sleep(5000);
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void studentAccRes() {
		try {
			synchronized(res1) {
				System.out.println("Student acquired and locked"+res1);
				Thread.sleep(5000);
				synchronized(res2) {
					System.out.println("Student acquired and locked"+res2);
					Thread.sleep(5000);
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
public class M4_synchronized_resource {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("Teacher");
		p2.setName("Student");
		
		p2.start();
		p1.start();
	}
}
