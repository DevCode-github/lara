package pack3_Synchronization;

class A{
	static int j = 0;
	void test() {	
//		for(int i = 0; i <= 1000 ; i++) {
		for (;j <= 1000 ; j++) {
//			System.out.println(Thread.currentThread().getName() + ":" + " i : " + i);
			System.out.println(Thread.currentThread().getName() + ":" + " j : " + j);
		}
	}
}
class Thread1 extends Thread{
	A obj;
	Thread1(A obj){
		this.obj = obj;
	}
	public void run() {
		obj.test();
	}
}
class Thread2 extends Thread{
	A obj;
	Thread2(A obj){
		this.obj = obj;
	}
	public void run() {
		obj.test();
	}
}
public class M1_synchronized {
	public static void main(String[] args) {
		A a1 = new A();
		Thread1 obj1 = new Thread1(a1);
		Thread2 obj2 = new Thread2(a1);
		obj1.start();
		obj2.start();
	}
}
