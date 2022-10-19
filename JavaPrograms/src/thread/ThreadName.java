package thread;

class TestName extends Thread
{
	public void run() {
		System.out.println("running...");
	}
}

public class ThreadName {
	public static void main(String[] args) {
		TestName t1 = new TestName();
		TestName t2 = new TestName();
		
		System.out.println("Name of t1 : "+t1.getName());
		System.out.println("Name of t2 : "+t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("t1Namechange");
		System.out.println("Name of t1 : "+t1.getName());
	}

}
