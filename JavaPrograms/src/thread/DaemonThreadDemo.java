package thread;

public class DaemonThreadDemo extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread working..");
		}else {
			System.out.println("user thread working..");
		}
	}
	
	public static void main(String[] args) {
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		DaemonThreadDemo t2 = new DaemonThreadDemo();
		DaemonThreadDemo t3 = new DaemonThreadDemo();
		
		t1.setDaemon(true);//now t1 is daemon thread
		//after starting thread you can't change user to daemon otherwise it will throw IllegalThreadStateException.
		t1.start();
		t2.start();
		t3.start();
	}

}
