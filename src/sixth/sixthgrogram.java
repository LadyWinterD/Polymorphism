package sixth;

class Person {
	private String name;

	public void getInfo() {
		System.out.println("My name is " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person {

	@Override
	public void getInfo() {
		System.out.println("My name is " + getName());
	}

}

public class sixthgrogram {
	public static void main(String args[]) {
		Person p = new Person();
		p.setName("Bill");
		Student s = new Student();
		s.setName("lily");
		p.getInfo();
		s.getInfo();
	}
}
