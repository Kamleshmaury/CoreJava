package ExceptionHandling;

public class ThrowsKey {
	public static void validate(int age) throws AgeIsNotValidException {
		
			if(age < 18) {
				throw new AgeIsNotValidException("Person age is not valid for vote");
			}
			else {
				System.out.println("Person is eligible to vote!!");  
			}
		}
	public static void main(String[] args) throws AgeIsNotValidException {
		validate(17);
	}

}
//throws keyword use to declare an exception it show that method may rise an exception