package pack4_Executor_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Demo implements Callable{
	public Object call() {
		System.out.println("call() method started in execution");
		return "succes";
	}
}
public class M1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Demo d = new Demo();
		//creating a thread pool with 10 threads
		ExecutorService es = Executors.newFixedThreadPool(10);
//		es.submit(d);
		//submitting task to the thread and collecting object returned by call() method
		for (int i = 1 ; i < 10 ; i++) {
			Future f = es.submit(d);
			System.out.println(f.get());
		}
		//shutdown method is used to terminate the execution of thread so that is would become available to execute other tasks
		es.shutdown();
	}
}
