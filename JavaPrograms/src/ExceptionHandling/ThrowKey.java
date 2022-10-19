package ExceptionHandling;

public class ThrowKey {
	public static void validate(int age) {
		try {
			if(age < 18) {
				throw new AgeIsNotValidException("Person age is not valid for vote");
			}
			else {
				System.out.println("Person is eligible to vote!!");  
			}
		}
		catch(AgeIsNotValidException ex) {
			System.out.println(ex);
		}
		
	}
	
	public static void main(String[] args) {
		validate(16);
		System.out.println("done....");
	}

}
//throw keyword use to rise an exception