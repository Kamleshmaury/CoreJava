package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println(queue);
		System.out.println(queue.poll());//reading and remove head element
		System.out.println(queue.peek());//reading head element
		System.out.println(queue.remove());//reading and remove head element
		System.out.println(queue.element());//reading head element
		System.out.println("============");
		Iterator<String> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
}

}
//FIFO