package ch02.ex01;

public class Person {

	/*
	 * 멤버변수 -> 값 세팅하는 방법
	 * 1. 생성자	: 값 저장
	 * 2. setter : 값 저장
	 * 3, getter : 값 반환
 	 */
	
	private String name;
	private int age;
	private String phone;
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	//생성자
	public Person(String n) {
		System.out.println("Person(String n)");
	}
	
	//생성자
	public Person(String n, int a, String p) {
		System.out.println("Person(String n, int a, String p)");
		name = n;
		age = a;
		phone = p;
	}
	
	void name(String n) {	//메소드 통해서 변수값 변경
		name = n;
	}
	
	void age(int a) {	//메소드 통해서 변수값 변경
		age = a;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int a) {	//setter 사용하여 변수값 변경
		age = a;
	}
	
	private void run() {
		System.out.println(name + " 달리다!");
	}
	
	void sleep() {
		System.out.println(name + " 자다!");
	}
	
	void eat() {
		System.out.println(name + " 먹다!");
	}
}
