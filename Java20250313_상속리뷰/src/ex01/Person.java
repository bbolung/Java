package ex01;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	void sleep() {}
	void eat() {}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + "살입니다.");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
