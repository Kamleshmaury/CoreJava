package reflection;

class Message
{
	void msg() {
		System.out.println("Hello Java");
	}
}

public class MethodDemo {
	public static void main(String[] args)  {
		
		try {
			Class<Message> c = Message.class;
			Message m = (Message) c.newInstance();
			m.msg();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
