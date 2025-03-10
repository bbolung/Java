package ch01.ex01;

class K {}

class A {
	String name;
	int age;
	
	//생성자
	A() {}
	A(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	void run() {
		System.out.println("run()");
	}
	void eat() {
		System.out.println("eat()");
	}
	
}
//B클래스가 상위클래스인 A 클래스를 상속하겠다.
class B extends A{
	String id;
	
	//생성자
	B(){}
	
	B(String name, int age, String id) {
		//다른 class 생성자 호출 -> super() 사용
		super(name, age);		//상위 클래스 A의 생성자 중 매개변수 값 2개를 갖는 생성자 호출
		this.id = id;
	}
}

//상속 STOP -> final 
final class C extends B{
	String pw;
	
	//생성자
	C() {}
	
	C(String name, int age, String id, String pw) {		
		super(name, age, id);	//상위 클래스 B의 생성자 중 매개변수 값 3개를 갖는 생성자 호출
		this.pw = pw;
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("B class : " + id);
		System.out.println("C class : " + pw);
	}
}

//class D extends C{}
//class B extends A, K{}	-> 다중 상속X

public class Main {

	public static void main(String[] args) {
		B b = new B();
		b.run();
		b.eat();
		
		C c = new C("홍길동", 20,  "test", "1234");
		c.displayInfo();
		
	}

}
