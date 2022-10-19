package oops;
class Flower
{
	void print() {
		System.out.println("Flower");
	}
}
class Rose extends Flower
{
	static void smell(Flower f) //instanceof use for compare 
	{
		if(f instanceof Rose) {
			Rose r = (Rose) f; //downcasting
			System.out.println("Downcasting perform");
		}
	}
}
public class Downcasting {
	public static void main(String[] args) {
		double d = 13.5;
		int i = (int) d;//downcasting 
		System.out.println(d);
		System.out.println(i);// while perform downcasting some data may loss
		
		//downcasting using instanceof operator
		Flower f1 = new Rose();
		Rose.smell(f1);
	}
}
