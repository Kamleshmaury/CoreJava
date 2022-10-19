package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class WriteObjectToFile {
	public static void main(String[] args) {
		try 
		{
			Properties p1 = new Properties();
			p1.put("name", "rakesj");
			p1.put("demo", "test");
			p1.put("hh", "hello");
			p1.put("lang", "java");
			FileOutputStream fout = new FileOutputStream("seri1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(p1);
			
			p1.store(out, "file store success..");
			out.close();
			
		} 
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
