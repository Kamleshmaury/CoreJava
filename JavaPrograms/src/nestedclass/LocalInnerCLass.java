package nestedclass;

public class LocalInnerCLass {
	
	private int data = 30;
	
	void display() {
		//local inner class created inside a method
		class Local{
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}
	public static void main(String[] args) {
		LocalInnerCLass lnc = new LocalInnerCLass();
		lnc.display();
	}

}
