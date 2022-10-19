package com.hops;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.google.gson.Gson;

public class ObjectToJson {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello from maven");

		Student st1 = new Student("Kamlesh", "976843567", "gujrat", 13680L);
		Student st2 = new Student("rahul", "346789", "lucknow", 268078L);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);

		PrintWriter pw = new PrintWriter(new FileWriter("std1.json"));
		Gson son = new Gson();
		String str = son.toJson(list);
		pw.write(str);// write object into json file
		System.out.println(str);
		pw.close();
	}

}
