package ch01.ex02;

/*
 * ### 상속 전체 조건 ###
 * 하위클래스는 상위클래스 자원 접근O (private 제외)
 * 상위클래스는 하위클래스 접근X
 */

public class Main {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.test(); 		//A class 출력
		
		B b1 = new B();
		b1.test(); 		//B class 출력(자신의 클래스 메소드만 출력)
		
		C c1 = new C();
		c1.test(); 		//C class 출력(자신의 클래스 메소드만 출력)
	
		System.out.println("-----다형성-----");
		
		A a2 = new C(); 
		a2.test(); 		//C class 출력(매소드 오버라이딩이기 때문 -> 참조하는 클래스의 메소드 출력)
		
		A a3 = new B();
		a3.test();		//B class
		
		B b2 = new C();
		b2.test();		//C class
	}
}
