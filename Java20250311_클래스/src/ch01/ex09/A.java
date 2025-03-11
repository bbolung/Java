package ch01.ex09;

public class A {
	private String name;
	private int age;
	
	A() {}
	A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void funcA() {
		System.out.println("funA()");
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A {
	private String address;
	
	B() {}
	B(String name, int age, String address) {
		super(name, age);	//상위 클래스 생성자 호출
		this.address = address;
	}
	
	//상위클래스가 가지고 있는 메소드 -> 재정의, 메소드 오버라이딩
	@Override	//상위클래스에 있는 메소드 재정의 하고 있다는 뜻
	void info() {
		//상위클래스 info() 메소드 호출, super() 맨 위에 위치!
		super.info();
		System.out.println("B class");
	}
	
	//단순 출력 -> 이렇게 작성 가능
	void infoB() {
		info();
		System.out.println(address);
	}
	
	void funB() {
		System.out.println("funB()");
	}
}
