package thread;

class ThreadName1 extends Thread
{
	public ThreadName1(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("ThreadName1 running...");
	}
}

public class ThreadNameChangeWithOutSetName {
	public static void main(String[] args) {
		ThreadName1 th1 = new ThreadName1("ThreadName-1");
		ThreadName1 th2 = new ThreadName1("ThreadName-2");
		
		System.out.println("Name of thread-1 : "+th1.getName());
		System.out.println("Name of thread-2 : "+th2.getName());
		th1.start();
		th2.start();
	}

}
