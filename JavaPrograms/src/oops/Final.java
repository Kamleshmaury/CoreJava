package oops;
final class M1
{
	void print() {
		System.out.println("From m1");
	}
	
}
class M2  //can't inherited b/s M1 is final
{
	final void add() {
		System.out.println("From M2");
	}
}
class M3 extends M2
{
	//can't override b/s add method is final
//	void add() {
//		
//	}
}
public class Final {
	final static int i =10;
	public static void main(String[] args) {
		//i=20; can't reinitialized b/s i is final
		System.out.println(i);
	}

}
