package ex03;

public class Person {
	private String name;
	private int age;
	
	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sleep() {
		System.out.println("sleep.....");
	}
	void eat() {}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//toString : 변수값 재정의(멤버변수에 어떤 값이 저장되어있는지 확인용)
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + "살입니다.");
	}
	
}
