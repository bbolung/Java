package ex01;

import java.util.Scanner;

public class ExceptionExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력>>");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력>>");
		int num2 = 0;
		
		while(true) {
			num2 = sc.nextInt();
			
			if(num2 == 0) {
				System.out.println("0은 입력하지 마세요!");
				System.out.println();
				System.out.println("0제외 정수 입력>>");
				continue;
			}
			break;
		}
		
		System.out.println("합: " + (num1+num2));
		System.out.println("뺄셈: " + (num1-num2));
		System.out.println("곱: " + (num1*num2));
		System.out.println("나누기: " + (num1/num2));
		
		System.out.println("프로그램 종료!");
		
		
	}

}
