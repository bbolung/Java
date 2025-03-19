package ex01;

import java.util.Scanner;

public class ExceptionExam05 {

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
		
		 
		try {
			System.out.println("나누기: " + (num1/num2));		
			System.out.println(str.length());		
		//Exception e 다음에 하위 예외 클래스 나열하면 에러 발생
		//이유 : Exceptioin이 모든 것을 다 해결하기에 나머지 하위 예외 클래스 필요 없기 때문
//		}catch(Exception e) {
//			e.printStackTrace();
		}catch(ArithmeticException e) {				
			System.out.println("0으로 나눌 때 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println("배열 공간 부족");
			e.printStackTrace();
			System.out.println(e.getMessage());		
		}catch(NullPointerException e) {
			System.out.println("참조값이 없다");
			e.printStackTrace();
			System.out.println(e.getMessage());
		//Exception이 맨 마지막에 오는 건 가능
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//예외 처리 후 / 정상 실행 후 나머지 실행
		System.out.println("프로그램 종료!");
		
		
	}

}
