package oops;
class Operation
{
	int data = 100;
	 void change(int i) {
		 data += i;
	 }
}
public class CallByValue {
	public static void main(String[] args) {
		Operation op = new Operation();
		System.out.println(op.data);
		op.change(20);//call by value
		System.out.println(op.data);
	}

}
//calling a method by passing value is k/w as call y value