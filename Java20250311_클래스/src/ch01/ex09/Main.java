package ch01.ex09;

public class Main {

	public static void main(String[] args) {
		A aa = new A();
		aa.funcA();
		
		//A 클래스 상속하는 B 클래스 -> A 클래스 변수와 메소드 사용O
		B bb = new B();
		
		//B 클래스에 매개변수 3개 입력 -> super 이용하여 생성자 생성
		B b2 = new B("지리산", 50, "전라남도 남원시");
		
		//b2에서 A 클래스와 B 클래스 변수, 메소드 모두 사용O
		b2.funcA();
		b2.info();
		b2.funB();
		
		System.out.println();
		
		//3개의 매개변수 모두 출력하고자 함 -> 메소드 오버라이딩
		b2.infoB();
	}

}
