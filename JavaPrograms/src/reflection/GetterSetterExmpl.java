package reflection;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;

class Person {
	private int id;
	private String name;
	private boolean flag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

public class GetterSetterExmpl {
	
	public static void main(String[] args) {
		GetterSetterExmpl ge = new GetterSetterExmpl();
		Person p1 = new  Person();
		ge.setter(p1, "name", "rahul");
		ge.setter(p1, "value", 12);
		ge.setter(p1, "flag", true);
		
		Field[] fields = p1.getClass().getDeclaredFields();
		for(Field f : fields) {
			String filedName = f.getName();
			System.out.println("FiledName : "+filedName);
		}
		ge.getter(p1, "name");
		ge.getter(p1, "value");
		ge.getter(p1, "flag");
	}
	
	private void setter(Object obj, String fName, Object value) {
		try
		{
			PropertyDescriptor pd = new PropertyDescriptor(fName, obj.getClass());
			pd.getWriteMethod().invoke(obj, value);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	private void getter(Object obj, String fieldName) {
		try {
			PropertyDescriptor pd = new PropertyDescriptor(fieldName, obj.getClass());
			System.out.println(" "+pd.getReadMethod().invoke(obj));
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
