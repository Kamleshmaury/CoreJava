package oops;

import pack1.A3;

class A2
{
	//access only with in same class
	private String course = "java";
	
	//access every where
	public void test1() {
		System.out.println("from A2 test1");
	}
}
public class AccessModifier extends A3{
	public static void main(String[] args) {
		A2 a2 = new A2();
		//System.out.println(a2.course);//can't use b/s course is private
		a2.test1();
		
		AccessModifier as = new AccessModifier();
		//as.i;// b/s i is default onlyaccess in same package
		System.out.println(as.name);//protected can be use out side package with inheritance
	}

}
