package synchrnized;

class Customer
{
	int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount < amount) {
			System.out.println("amout is less waiting fot deposite...");
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amount = amount;
			System.out.println("withdraw successfull...");
		}
	}
	
	synchronized void deposite(int amount) {
		System.out.println("going to deposite...");
		this.amount = amount;
		System.out.println("Deposite success..");
		notify();
	}
}

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				c1.withdraw(15000);
			};
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				c1.deposite(20000);
			};
		};
		t2.start();
	}	
}
