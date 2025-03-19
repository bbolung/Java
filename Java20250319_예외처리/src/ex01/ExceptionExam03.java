package ex01;

import java.util.Scanner;

public class ExceptionExam03 {

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
			System.out.println(str.length());		//NullPointerException
			
		}catch(ArithmeticException e) {				//num2 = 0 입력하면 원래 에러발생 -> 프로그램 중단
			System.out.println("0으로 나눌 때 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {	//arr[5] = 10; 입력하면 배열 공간 부족으로 원래 에러발생 -> 프로그램 중단
			System.out.println("배열 공간 부족");
			e.printStackTrace();
			System.out.println(e.getMessage());		//str = null; 이기에 에러 발생
		}catch(NullPointerException e) {
			System.out.println("참조값이 없다");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//예외 처리 후 / 정상 실행 후 나머지 실행
		System.out.println("프로그램 종료!");
		
		
	}

}
