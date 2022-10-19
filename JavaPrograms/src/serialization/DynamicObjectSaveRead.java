package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DynamicObjectSaveRead {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		list.add("hello to alll");
		list.add("from java");
		list.add("test java to all");
		saveObjects(list);
		ArrayList<Object> list1 = readObjects();
		System.out.println(list1);
	}

	public static void saveObjects(ArrayList<Object> al) {
		try {
			FileOutputStream fos = new FileOutputStream("outputFile", true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Object o : al) {
				oos.writeObject(o);
				System.out.println("saved");
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Object> readObjects() {
		ArrayList<Object> al = new ArrayList<Object>();
		boolean cont = true;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("outputFile"));
			while (cont) {
				Object obj = null;
				obj = ois.readObject();
				if (obj != null)
					al.add(obj);
				else
					cont = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return al;
	}
}
