package concurrency;

import java.util.LinkedList;

public class ThreadSignalingDemo {
	public static void main(String[] args) {
		PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.produce();
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.consume();
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

	static class PC {
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		public void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					// wait while list is empty
					while (list.size() == capacity)
						wait();
					System.out.println("Producer produced-" + value);

					// to insert the jobs in the list
					list.add(value++);

					// notifies the consumer thread that now it can start consuming
					notify();

					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (list.size() == 0)
						wait();
					int val = list.removeFirst();

					System.out.println("Consumer consumed-" + val);

					// Wake up producer thread
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
