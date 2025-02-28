package ch01.ex11;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// 삼항 연산자(조건 연산자)
		
		Scanner sc = new Scanner(System.in);	//키보드에서 입력받음
		
		System.out.println("정수 입력: ");
		
		int number = sc.nextInt();	//정수값만 인수로 가짐
		
		//조건 ? true일 때 "양수입력함" 출력 : false일 때 "음수입력함" 출력
		//String result = (number>0) ? "양수입력함" : "음수입력함";
		
		//절대값으로 출력
		int result = (number > 0) ? number : -number;
		
		System.out.println(result);
		
		
	}

}
