package ch01.ex01;

/*
 * ### 상속 전체 조건 ###
 * 하위클래스는 상위클래스 자원 접근O (private 제외)
 * 상위클래스는 하위클래스 접근X
 */

public class Main {

	public static void main(String[] args) {
		
		C c1 = new C("지리산", "전북 남원", 40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B b1 = new B("남산", "서울");
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();
		
		System.out.println("-----자동 타입 변환-----");
		
		/*
		 * ### 자동 타입 변환 ###
		 * 상위클래스는 하위클래스를 찹조O
		 * 단, 하위클래스 자원에는 접근X
		 * 자신 클래스에만 접근O
		 */
		
//		B b2 = new B("치악산", "원주");
//		A a2 = b2;		-> A a2 = (A)b2; 이렇게 자동 타입 변환
//		밑에와 동일함
		
		//상위클래스가 하위클래스 참조O, BUT 사용은 상위클래스의 변수와 메소드만 가능
		A a2 = new B("치악산", "원주");
		a2.funcA();
//		a2.funcB(); 	-> 하위클래스 접근X
		
		A a3 = new C("한라산", "제주", 31);
		a3.funcA();
		
		System.out.println("-----강제 타입 변환-----");
		
		/*
		 * 기본변수 강제 타입 변환
		 	int a = 10;
		 	double d = 1.2;
		 	d = a;  -> 10.0 자동타입변환
		 	a = (int)d;  -> 1 강제타입변환
		 */
		
		A a4 = new B("백두산", "함경북도");
		B b2 = new B("백두산", "함경북도");
		
		/* 강제 타입 변환 안되는 경우
		A a5 = new A();
		B b3 = new B();
		a5 = b3;		-> b3의 타입이 A로 자동 변환O
		b3 = (B)a5;		-> 강제타입변환 실행은 O
		b3.funcA();	    -> 에러발생 => 강제타입변환 허용X
		*/
		
		//강제 타입 변환 되는 경우
		A a6 = new B();
		A b4 = new B();
		b4 = (B)a6;		//강제타입변환 허용
		
		A a7 = new C();
		B b5;
		b5 = (B)a7; 	//강제타입변환 가능
		b5.funcB();
		b5.funcA();
		
		A a8 = new C();
		C c2 = (C)a8;	//강제타입변환 가능
		
		A a10 = new A();
		B b6 = new B();
		a10 = b6;
		B b7 = (B)a10;	//강제타입변환 가능
		b7.funcA();
		b7.funcB();
		
	}

}
