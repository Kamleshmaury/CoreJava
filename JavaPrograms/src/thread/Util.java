package thread;

public class Util {
	
	public static void sleep(long milli) {
		try {
			Thread.sleep(milli);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void sleep(long milli, int nanoSec) {
		try
		{
			Thread.sleep(milli, nanoSec);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
//sleep() execute then it stop the current thread and going to unser sleep stage for given time