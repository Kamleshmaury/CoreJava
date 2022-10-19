package filecompression;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class GZIPToSerializedObject {
	public static void main(String[] args) {
		String path = "D:\\new\\io\\std.gzip";
		try
		{
			FileInputStream fin = new FileInputStream(path);
			GZIPInputStream gis = new GZIPInputStream(fin);
			ObjectInputStream ois = new ObjectInputStream(gis);
			
			Student std =(Student) ois.readObject();
			
			System.out.println(std);
			
			ois.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
