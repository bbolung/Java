package ch01.ex04;

public class OperatorExample {

	public static void main(String[] args) {
		/*
		 * 정수 연산자 정수 = 정수 ex) 5/2 = 2, 나머지 1은 버림
		 * 정수 연산자 실수 = 실수(소수점O) ex) 5/2.0 = 2.5
		 * 실수 연산자 실수 = 실수 ex) 5.0/2.0 = 2.5
		 * 정수 연산자 문자열 = 문자열 ex)10 + "ab" = "10ab"
		 * 실수 연산자 문자열 = 문자열 ex) 10.2 + "10" = "10.210"
		 * 문자열 연산자 문자열 = 문자열 ex) "10.2" + "20" = "10.220"
		 */
		int a = 5;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	// 정수/정수 = 정수값 출력, 소수점이하는 버림
		System.out.println(a%b);	// 나머지 연산자, 나머지값을 출력
		
		
	}

}
