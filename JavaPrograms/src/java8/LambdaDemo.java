package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Draw {
	void draw(int width);
}

interface Say {
	String say();
}

public class LambdaDemo {
	public static void main(String[] args) {
		Draw d1 = (a) -> System.out.println("draw rectangle.width - " + a);
		d1.draw(10);

		Say s1 = () -> {
			return "Hi from lambda...";
		};
		System.out.println(s1.say());
		List<String> list = Arrays.asList("hello","test","hi","to");
		list.forEach(a -> System.out.println(a));
		
		ProductAdd p1 = new ProductAdd(101, "pulse", 90);
		ProductAdd p2 = new ProductAdd(102, "rice", 40);
		ProductAdd p3 = new ProductAdd(103, "aata", 45);
		List<ProductAdd> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		Collections.sort(plist,(o1,o2)-> o1.name.compareTo(o2.name));
		System.out.println(plist);
		
		plist.stream().filter(a -> a.price < 50).forEach(System.out::println);
		long size = plist.stream().count();
		System.out.println(size);
		
		
	}

}



















