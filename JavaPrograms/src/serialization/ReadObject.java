package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadObject {
	public static void main(String[] args) {
		
		try
		{
			//Deserialization
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("std1.txt"));  
			
			Student s=(Student)in.readObject();  
			System.out.println(s.id+" "+s.name);
			
			Student s1=(Student)in.readObject();  
			System.out.println(s1.id+" "+s1.name);
			in.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
