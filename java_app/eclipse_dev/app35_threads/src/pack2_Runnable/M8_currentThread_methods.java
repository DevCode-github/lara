package pack2_Runnable;

public class M8_currentThread_methods {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		/*
		 * Every thread will have a unique id.
		 */
		System.out.println(t1.getId());
		/*
		 * Name of the thread.
		 * Also, setName to set the name of thread.
		 */
		System.out.println(t1.getName());
		/*
		 * Preference for Threads. 
		 * Integer number between 1 - 10.
		 * 1 - minimum
		 * 5 - normal
		 * 10 - maximum
		 * Also, setPriority() to modify preference of a thread.
		 */
		System.out.println(t1.getPriority());
		/*
		 * Threads are two types : 1)Daemon 2)User
		 * Also, Convert user to Daemon, Daemon to user through setDaemon().
		 */
		System.out.println(t1.isDaemon());
	}
}
