package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		/* 
		 * 키보드 통해서 국어점수, 영어점수 입력 받는다.
		 * 국어점수, 영어점수 둘 다 70이상이면 합격, 아니면 불합격
		 * 이상 >=, 초과 >, 이하 <=, 미만 <
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int korScore = sc.nextInt();
		
		sc.nextLine(); 	//nextLine() 사용했을 때 발생하는 오류 수정 => 버퍼 enter키 비우기
		
		System.out.println("영어점수: ");
		int engScore = sc.nextInt();
		
		String result = ((korScore >=70) && (engScore >=70)) ? "합격" : "불합격";
		
		System.out.println(result);
		
		
		
	}

}
