package thread;

public class MultiThreadAnonyous {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run(){
				 for(int i=0;i<=10;i++)
				System.out.println("from t1 thread...");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				 for(int i=0;i<=10;i++)
				System.out.println("from t2 thread...");
			}
		};
		t1.start();
		t2.start();
		
		
		
	}

}
