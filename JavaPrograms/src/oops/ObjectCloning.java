package oops;

public class ObjectCloning implements Cloneable{
	
	private int rollNum;
	private String name;
	
	
	
	public ObjectCloning(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	protected
	 Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning obj1 = new ObjectCloning(1, "rahul");
		
		ObjectCloning cloneObj = (ObjectCloning) obj1.clone();
		
		System.out.println(obj1.name+":"+obj1.rollNum);
		
		System.out.println(cloneObj.rollNum+":"+cloneObj.name);
	}

}
//clone is way to create exact copy of an object 
//clone() of Object class use to clone the object