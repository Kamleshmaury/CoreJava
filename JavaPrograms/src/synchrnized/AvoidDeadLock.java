package synchrnized;

import thread.Util;

public class AvoidDeadLock {
	public static void main(String[] args) {
		
		AvoidDeadLock obj = new AvoidDeadLock();
		resource1 a = obj.new resource1();
		resource2 b = obj.new resource2();
		
		Runnable r1 = new Runnable() {
			public void run() {
				Util.sleep(100);
				synchronized (a) {
					System.out.println("In blcok 1");
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				Util.sleep(100);
				synchronized (b) {
					System.out.println("In blcok 2");
				}
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
	} 
	
	private class resource1 {
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

	}
	
	private class resource2 {
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

	}

}
