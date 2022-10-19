package synchrnized;

import thread.Util;

class Sender
{
	public void senderMessage(String msg) {
		System.out.println("Sending message "+msg);
		Util.sleep(800);
		System.out.println(msg+" sent...");
	}
}
class SenderX extends Thread
{
	Sender sd;
	String msg;
	public SenderX(String msg, Sender sd) {
		this.msg = msg;
		this.sd = sd;
	}
	
	public void run() {
		synchronized (sd) {
			sd.senderMessage(msg);
		}
	}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Sender obj = new Sender();
		SenderX t1 = new SenderX("Frmo 1 thread", obj);
		SenderX t2 = new SenderX("Frmo 2 thread", obj);
		t1.start();
		t2.start();
	}

}
