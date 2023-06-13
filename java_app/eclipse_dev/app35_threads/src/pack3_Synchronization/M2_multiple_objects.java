package pack3_Synchronization;

class B{
	synchronized void test() {
		for(int i = 0; i <= 1000 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + " i : " + i);
		}
	}
}
class Thread_1 extends Thread{
	B obj;
	Thread_1(B obj){
		this.obj = obj;
	}
	public void run() {
		obj.test();
	}
}
class Thread_2 extends Thread{
	B obj;
	Thread_2(B obj){
		this.obj = obj;
	}
	public void run() {
		obj.test();
	}
}
public class M2_multiple_objects {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		Thread_1 obj1 = new Thread_1(b1);
		Thread_2 obj2 = new Thread_2(b1);
		obj1.start();
		obj2.start();
	}
}
