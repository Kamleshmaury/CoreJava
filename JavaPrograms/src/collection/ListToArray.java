package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Amit");  
		list.add("Vijay");  
		list.add("Karan");  
		list.add("Jai");  
		list.add("Rahul");  
		
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = list.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(arr1));
	}

}
