package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToCollection {
	public static void main(String[] args) {
		Integer[] arr = {3,6,8,23,6,90,21};
		
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, arr);
		
		
		List<Integer> list = Arrays.asList(arr);
		list.forEach(System.out::println);
		
	
	}

}
