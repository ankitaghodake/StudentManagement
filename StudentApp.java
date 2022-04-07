package TestApp;

import java.util.Scanner;

public class StudentApp {
	// StudentApp student=new StudentApp();

	Scanner sc = new Scanner(System.in);
	public int id;
	public int age;
	public String name;

	public StudentApp() {

	}

	public StudentApp(int id, String name, int age) {
		super();
		this.id = id;

		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentApp [id=" + id + ", age=" + age + ", name=" + name + "]";
	}


}
