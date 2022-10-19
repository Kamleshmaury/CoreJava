package collection;

import java.util.LinkedList;
import java.util.ListIterator;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}	
	
	
}

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("===============");
		LinkedList<Book> bk = new LinkedList<>();
		bk.add(new Book(101,"Let us C","Yashwant Kanetkar","BPB",8));
		bk.add(new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));  
		bk.add(new Book(103,"Operating System","Galvin","Wiley",6));  
		
		for(Book b : bk) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		System.out.println("===========");
		ListIterator<Book> lit = bk.listIterator(bk.size());
		lit.add(new Book(104,"Admin System","Rakesh","System",27));//we can add new Book element after listiterate
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
