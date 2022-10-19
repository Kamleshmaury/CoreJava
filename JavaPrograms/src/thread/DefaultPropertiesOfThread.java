package thread;

public class DefaultPropertiesOfThread {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println("id: "+t1.currentThread().getId());
		System.out.println("name: "+t1.currentThread().getName());
		System.out.println("priority: "+t1.currentThread().getPriority());
		System.out.println("state: "+t1.currentThread().getState());
	}

}
