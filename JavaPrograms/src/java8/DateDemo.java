package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		System.out.println(ldt.format(df));
	}

}
