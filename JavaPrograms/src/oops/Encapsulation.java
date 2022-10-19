package oops;

class Person {
	private int id;
	private String name, education;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Rahul");
		p1.setEducation("BA");
		System.out.println(p1.getId()+" : "+p1.getName()+" : "+p1.getEducation());
	}

}















