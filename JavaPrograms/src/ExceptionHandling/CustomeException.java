package ExceptionHandling;

import java.util.Scanner;

class NumberIsNotValid extends Exception
{
	public NumberIsNotValid(String str) {
		super(str);
	}
}
public class CustomeException {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int num = sc.nextInt();
			if(num < 15) {
				throw new NumberIsNotValid("Please enter number > 15");
			}
			else {
				System.out.println("You have entered "+num);
			}
		}
		catch(NumberIsNotValid ex) {
			System.out.println(ex);
		}
	}

}
