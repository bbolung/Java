package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {
		/* 
		 * 키보드 통해서 국어점수를 입력 받는다.
		 * 국어점수
		 * 80이상 -> 상
		 * 60이상 -> 중
		 * 59이하 -> 하
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수: ");
		int korScore = sc.nextInt();
		
		String result = (korScore >= 80) ? "상" : (korScore >= 60) ? "중" : "하";
		
		System.out.println(result);
		
		
		
		
	}

}
