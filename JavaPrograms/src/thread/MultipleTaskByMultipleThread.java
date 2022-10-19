package thread;

class Thread1 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println("Thread 1..."+i);
	}
}

class Thread2 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println("Thread 2..."+i);
	}
}

public class MultipleTaskByMultipleThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
