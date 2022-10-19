package synchrnized;

import thread.Util;

public class DeadLockDemo {
	public static void main(String[] args) {
		String res1 = "test1";
		String res2 = "test2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println("Thread 1 :locked res 1");
					Util.sleep(100);
					synchronized (res2) {
						System.out.println("Thread 1 :locked res 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println("Thread 2 :locked res 2");
					Util.sleep(100);
					synchronized (res1) {
						System.out.println("Thread 2 :locked res 1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
