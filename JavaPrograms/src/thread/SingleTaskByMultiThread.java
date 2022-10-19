package thread;

class MultiTasking1 implements Runnable
{
	public void run() {
		 for(int i=0;i<=10;i++)
		System.out.println("Task1()...");
	}
}

public class SingleTaskByMultiThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MultiTasking1());
		Thread t2 = new Thread(new MultiTasking1());
		
		t1.start();
		t2.start();
	}
}
//perform single task by multiple thread