package generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape 
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw() {
		System.out.println("Drawing rectangle..");
	}
}
class Circle extends Shape
{
	void draw() {
		System.out.println("Drawing circle...");
	}
	
}

public class WildCardGeneric {
	//it accept only child of Shape
	public static void drawShape(List<? extends Shape> list) {
		for(Shape s : list) {
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		List<Rectangle> rlist = new ArrayList<>();
		rlist.add(new Rectangle());
		
		List<Circle> clist = new ArrayList<>();
		clist.add(new Circle());
		clist.add(new Circle());
		
		drawShape(rlist);
		drawShape(clist);
	}

}
