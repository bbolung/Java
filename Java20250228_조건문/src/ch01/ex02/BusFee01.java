package ch01.ex02;

import java.util.Scanner;

public class BusFee01 {

	public static void main(String[] args) {
		//if ~ else if ~ else => 참인 경우 바로 빠져나옴. 나머지 조건문 생략
		
		/*
		 * 버스요금 계산 프로그램
		 * 기본요금 : 2000
		 * 1~5세 : 무료
		 * 6~12세 : 50% 할인
		 * 13~18세 : 25% 할인
		 * 65세 이상 : 무료
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이: ");
		
		int age = sc.nextInt();
		
		if((age >= 1) && (age <= 5)) {
			System.out.println("무료");
		}else if((age >= 6) && (age <= 12)) {
			System.out.println("1000");
		}else if((age >= 13) && (age <= 18)) {
			System.out.println("1500");
		}else if(age >= 65) {
			System.out.println("무료");
		}
		
		System.out.println("종료");
	}

}
