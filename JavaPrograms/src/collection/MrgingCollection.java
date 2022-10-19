package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MrgingCollection {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(3);
		list1.add(233);
		list1.add(123);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(523);
		list2.add(53);
		list2.add(53);
		list2.add(83);
		list1.addAll(list2);
		System.out.println(list1);
		
		List<Integer> collection1 = List.of(1, 2, 3);
		Collection<Integer> collection2 = List.of(97, 98, 99);
		Collection<Integer> merged = Stream.of(collection1,collection2).flatMap(Collection::stream).collect(Collectors.toList());
		merged.forEach(System.out::println);
		
	}

}
