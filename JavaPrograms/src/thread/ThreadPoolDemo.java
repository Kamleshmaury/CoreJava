package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String msg;

	public WorkerThread(String msg) {
		this.msg = msg;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + ":start msg " + msg);
		Util.sleep(2000);
		System.out.println(Thread.currentThread().getName() + ": end " + msg);
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 thread
		
		for (int i = 0; i <= 5; i++) 
		{
			Runnable worker = new WorkerThread("t1 " + i);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("finish all threads");
	}
}
