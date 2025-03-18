package ex01;

public class RemoteTest {

	public static void main(String[] args) {
//		RemoteControl re = new RemoteControl();		-> 추상클래스처럼 객체 생성X
		
		//객체 생성
		RemoteControl remote = new Telvision();
		remote.turnOn();
		
		RemoteControl remote2 = new Radio();
		remote2.turnOn();
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		System.out.println(A.number); 		//객체 생성X 사용O
		
		B bb = new B();						//static이 아닌 경우 객체 생성 후 메소드 사용O
		System.out.println(bb.number);
	}
}

class A {
	public static int number = 100;
}

class B {
	public int number = 100;
}
