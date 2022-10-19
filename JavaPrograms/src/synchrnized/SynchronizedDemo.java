package synchrnized;

import thread.Util;

class Table
{
	synchronized void printTable(int n) {
		for(int i=1; i<=5;i++) {
			System.out.println(n*i);
			Util.sleep(400);
		}
	}
}

class MyThread1 extends Thread
{
	Table t1;
	public MyThread1(Table t1) {
		this.t1 = t1;
	}
	
	public void run() {
		t1.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t2;
	public MyThread2(Table t2) {
		this.t2 = t2;
	}
	
	public void run() {
		t2.printTable(100);
	}
}
public class SynchronizedDemo {
	public static void main(String[] args) {
		Table obj = new Table();
		
		MyThread1 th1 = new MyThread1(obj);
		MyThread2 th2 = new MyThread2(obj);
		
		th1.start();
		th2.start();
	}

}
