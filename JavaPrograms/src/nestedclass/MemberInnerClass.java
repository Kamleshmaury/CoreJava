package nestedclass;

public class MemberInnerClass {
	
 private int i = 10;
	
	//inner class
	class Inner1
	{
		void msg() {
			System.out.println("msg is :"+i);
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		MemberInnerClass.Inner1 inner = obj.new Inner1();
		inner.msg();
	}

}
