package ch01.ex03;

/*
 * 생성자 오버로딩
 */

public class Person {		//접근제한자 public -> 다른 package에서 접근O(Person p = new Person();)
	
	private String name;
	private int age;
	
	//값 입력 : 생성자 생성/setter 사용
	//생성자는 class와 접근제한자 동일하게 작성
	public Person() {
		//초기값 입력
		this("남산", 1);		//(인자값 2개 받는)생성자 호출 this, 항상 맨 위에 위치
//		name = "남산";
//		age = 1;
	}
	
	public Person(String name) {
		this(name, 1);		
//		this.name = name;
//		age = 1;
	}
	
	public Person(String name, int age) {		//인자값 2개 받는 생성자
		this.name = name;
		this.age = age;
	}
	
	String displayInfo() {
		return name + " : " + age;		//sysout 사용해도 되지만 이렇게 작성O
	}
	
	
	public void run() {		//접근제한자 public -> 다른 package에서 접근O(p.run();)
		System.out.println("run.........");
	}
	
	public void eat() {
		System.out.println("eat.........");
	}
	
	

}
