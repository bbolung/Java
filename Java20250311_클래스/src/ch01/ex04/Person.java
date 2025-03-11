package ch01.ex04;

/*
 * setter, getter
 */

public class Person {	
	private String name;
	private int age;
	
	void setName(String name) {		//반환타입 필요X = void
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {			//name만 반환
		return name;
	}
	
	int getAge() {				//age만 반환
		return age;
	}
	
	public Person() {
		this("남산", 1);	

	}
	
	public Person(String name) {
		this(name, 1);		

	}
	
	public Person(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	String displayInfo() {
		return name + " : " + age;		
	}
	
	public void run() {	
		System.out.println("run.........");
	}
	
	public void eat() {
		System.out.println("eat.........");
	}
	
	

}
