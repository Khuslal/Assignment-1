package javacollection;

public class Student {
	private String name; 
	private int age;
	private String campus;
	
	Student(String name, int age, String campus) {
		this.name = name;
		this.age = age;
		this.campus = campus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCampus() {
		return campus;
	}

	void printStudent() {
		System.out.println("This is Student class");
	}
}
