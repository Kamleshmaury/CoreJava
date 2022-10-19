package thread;

public class ThreadPriorityDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("inside run method..."+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		ThreadPriorityDemo t3 = new ThreadPriorityDemo();
		
//		System.out.println("Priority of thread t1 "+t1.getPriority());
//		System.out.println("Priority of thread t2 "+t2.getPriority());
//		System.out.println("Priority of thread t3 "+t3.getPriority());
//		
		t1.setPriority(6);
		t2.setPriority(3);
//		t3.setPriority(9);
		t1.start();
		t2.start();
//		System.out.println("Priority of thread t1 "+t1.getPriority());
//		System.out.println("Priority of thread t2 "+t2.getPriority());
//		System.out.println("Priority of thread t3 "+t3.getPriority());
//		
//		System.out.println("Currently executing thread :"+Thread.currentThread().getName());
//		System.out.println("Priority of main thread :"+Thread.currentThread().getPriority());
//		
//		Thread.currentThread().setPriority(10);
//		System.out.println("Priority of main thread :"+Thread.currentThread().getPriority());
	}

}
