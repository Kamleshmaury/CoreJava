package synchrnized;

import thread.Util;

class Addition
{
	synchronized static void add(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+i);
			Util.sleep(400);
		}
	}
}
class Thread1 extends Thread
{
	public void run() {
		Addition.add(1);
	}
}
class Thread2 extends Thread
{
	public void run() {
		Addition.add(10);
	}
}
class Thread3 extends Thread
{
	public void run() {
		Addition.add(100);
	}
}
public class StaticSynchronizedDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
