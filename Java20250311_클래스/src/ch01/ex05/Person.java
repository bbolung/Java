package ch01.ex05;

/*
 * static(정적) 	 <==>    인스턴스(static이 안붙는 것들)
 * 인스턴스 변수(멤버변수), 인스턴스 메소드(멤버메소드)
 * 정적변수, 정적메소드
 */

public class Person {	
	
	private String name;
	private int age;
	
	static int count;	//정적변수
	
	static void f1() {}
	
	static void func() {
		//정적변수와 메소드만 사용O, 인스턴스X
		count++;
		f1();
//		age++;
//		eat();
		System.out.println("정적메소드 func()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	String displayInfo() {
		return name + " : " + age;		
	}
	
	public void run() {	
		//인스턴스 메소드에서는 인스턴스, 정적 모두 사용가능
		count++;
		func();
		eat();
		age++;
		
		System.out.println("run.........");
	}
	
	public void eat() {
		System.out.println("eat.........");
	}
	
	

}
