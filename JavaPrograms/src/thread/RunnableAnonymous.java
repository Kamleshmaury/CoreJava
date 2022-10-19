package thread;

public class RunnableAnonymous {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("from r1 ...");
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("from r2 ...");
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
