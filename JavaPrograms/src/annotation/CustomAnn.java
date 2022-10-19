package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Person {
	String name();

	int age();

	String city();
}

@Person(age = 24, city = "lucknow", name = "rahul")
public class CustomAnn {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CustomAnn cu = new CustomAnn();
		Class cs = cu.getClass();
		Person ps = (Person) cs.getAnnotation(Person.class);
		System.out.println(ps.name() + ":" + ps.age() + ":" + ps.city());

	}

}
