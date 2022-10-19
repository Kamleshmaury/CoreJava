package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Book
{
	String book_name() default "MySql";
	int book_price() default 235;
	String bok_author() default "rahul";
}


@Book(book_name = "Java",book_price = 300,bok_author = "Kamlesh")
class JavaBook
{
	String bname;
	String bauthor;
	int bprice;
	public JavaBook(String bname, String bauthor, int bprice) {
		super();
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
	}
	
	public void bookDetails() {
		System.out.println("Book name : "+bname);
		System.out.println("Book author : "+bauthor);
		System.out.println("Book price : "+bprice);
	}
}

public class CustomAnnoatation {
	public static void main(String[] args) {
		JavaBook jb = new JavaBook("Spring", "Nitesh", 640);
		jb.bookDetails();
		
		Class book = jb.getClass();
		Annotation an = book.getAnnotation(Book.class);
		Book ba = (Book) an;
		System.out.println("Read suing annotation=====");
		System.out.println("Name of Book : "+ba.book_name());
		System.out.println("Name of Author : "+ba.bok_author());
		System.out.println("Price : "+ba.book_price());
	}

}
