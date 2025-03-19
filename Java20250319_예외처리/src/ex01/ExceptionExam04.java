package ex01;

import java.util.Scanner;

public class ExceptionExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력>>");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력>>");
		int num2 = sc.nextInt();
		
		System.out.println("합: " + (num1+num2));
		System.out.println("뺄셈: " + (num1-num2));
		System.out.println("곱: " + (num1*num2));
		
		int[] arr = new int[5];
		String str = null;
		
		//에러 발생시 중단 방지(예외 발생하면 나머지 실행하지 않고 해당 에러 원인(catch)로 이동하여 예외 처리) 
		try {
			System.out.println("나누기: " + (num1/num2));		//ArithmeticException
//			arr[5] = 10;	-> ArrayIndexOutOfBoundsException
			System.out.println(str.length());				//NullPointerException
			
		}catch(Exception e) {				//상위 클래스 Exception에서 모든 에러 잡음, 디테일은 좀 떨어질 수 있지만 코드 간결화O
			System.out.println("예외발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//예외 처리 후 / 정상 실행 후 나머지 실행
		System.out.println("프로그램 종료!");
		
		
	}

}
