package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA();   		//매개변수X = 1번째 함수호출
		functionA(10); 		//매개변수: 정수 = 2번째 함수호출
		functionA(10.2); 	//매개변수: 실수 = 3번째 함수호출
		functionA(10,20);	//매개변수: 2가지 정수 = 4번째 함수호출
		
	}
	
	//함수명은 동일한데, 매개변수명과 개수가 다른 것 => 함수오버로딩
	public static void functionA() {
		System.out.println("functionA");
	}
	
	public static void functionA(int n) {
		System.out.println("void functionA(int n)");
	}
	
	public static void functionA(double n) {
		System.out.println("void functionA(double n)");
	}
	
	public static void functionA(int n, int n2) {
		System.out.println("void functionA(int n, int n2)");
	}

}
