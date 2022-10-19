package oops;
interface Draw
{
	int i=10;
	void draw();
}
interface Calculate
{
	double area(double r);
}
class Circle implements Draw,Calculate
{ 
	public void draw() {
		System.out.println("Drawing Circle...");
	}
	
	@Override
	public double area(double r) {
		double a = Math.PI*r*r;
		return a;
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.i);
		c1.draw();
		System.out.println("Area of circle : "+c1.area(4));
	}

}
//inside interface develop only abstract method  
//using interface we can achieved multiple inheritance