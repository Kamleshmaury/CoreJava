package nestedclass;

interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
}



public class NestedInterface implements Showable.Message{
	public static void main(String[] args) {
		Showable.Message sm = new NestedInterface();
		sm.msg();
	}
	@Override
	public void msg() {
		System.out.println("From msg ");
	}

}
//an interface declare inside another interface