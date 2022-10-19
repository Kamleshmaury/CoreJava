package thread;
class ThreadJion extends Thread
{
	public void run() {
		System.out.println("Current Thread name is : "+Thread.currentThread().getName());
		for(int i=0; i<5;i++) {
			Util.sleep(1000);
			System.out.println(i);
		}
	}
}
public class JoiningThread {
	public static void main(String[] args) {
		ThreadJion th1 = new ThreadJion();
		ThreadJion th2 = new ThreadJion();
		ThreadJion th3 = new ThreadJion();
		
		th1.start();//wait to finish th1 thread then start another thread
		
		try {
			th1.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		th2.start();
		th3.start();
	}
}
//one thread wait until another thread finish the task