package ch04.ex01;

import java.util.Scanner;

public class ForExample04 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자 입력 받는다.
		 * 5 	--> 1~5 누적합 15 출력
		 * 10 	--> 1~10 누적합 55 출력
		 * 100  --> 1~100 누적합 5050
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();
		int sum = 0; 	//sum값 초기화(sum=0) -> 에러발생X
		
		for(int i=1; i<=num; i++) {
			if(i%2 == 1)	//홀수인지 조건판단 -> 홀수 누적합계 구함. 
			sum += i;
		}
		System.out.println("누적합: " + sum);
		
		sum = 0;	//아래 sum 누적합계를 위해서 sum값 초기화
		
		for(int i=1; i<=num; i += 2) {	//i += 2 -> 1부터 시작하는 경우 i = 홀수
				sum += i;
		}
		
		System.out.println("누적합: " + sum);
	
	}

}
