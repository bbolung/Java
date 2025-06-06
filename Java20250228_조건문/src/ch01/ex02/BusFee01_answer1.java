package ch01.ex02;

import java.util.Scanner;

public class BusFee01_answer1 {

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
		
		int age = 0;
		double fee = 2000; 	//버스요금
		double rate = 0; 	//할인율
		
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		
		if(age >= 65 || age <= 5) {
			rate = 0;
		}else if(age >= 6 && age <= 12) {
			rate = 0.5;
		}else if(age >= 13 && age <= 18) {
			rate = 0.75;
		}else if(age >= 19 && age <= 64) {
			rate = 1;
		}
		
		fee = fee * rate;
		//System.out.println("버스 요금: " + fee + " 원입니다."); => 2000.0원 이렇게 출력됨
		//fee와 rate 둘 다 실수 -> 계산 후 소수점 정리
		System.out.printf("버스 요금: %.0f원입니다.\n",fee);
		
		
		
		System.out.println("종료");
	}

}
