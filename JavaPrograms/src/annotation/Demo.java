package annotation;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Demo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(23);
		list.add(2);
		list.add(3);
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
