package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

	public static void main(String[] args) {
		//객체 참조변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		
		//삼항연산자(조건연산자)
		//(조건판단) ? 참 : 거짓;
		//(조건1) ? 참 : (조건2) ? 참 : 거짓; 
		//String msg = (number > 0) ? "양수" : "음수";
		
		String msg = "";
		if(number > 0) {		//실행문 하나일 경우 {} 생략가능, 둘 이상 -> {} 필수!
			msg = "양수";
		}else {
			msg = "음수";
		}
		
//		if(number > 0), "양수";
//		else msg = "음수";
		
		System.out.println(msg);
		
	}

}
