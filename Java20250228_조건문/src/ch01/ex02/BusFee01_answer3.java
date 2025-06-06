package ch01.ex02;

import java.util.Scanner;

public class BusFee01_answer3 {

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
		int fee = 2000; 	//버스요금
		double rate = 0; 	//할인율
		
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		
		/*
		 * => 5세 이하 || 65세 이상 = 무료
		 * => 6세 이상 = 50% 할인
		 * => 13세 이상 = 25% 할인
		 * => 19세 이상 = 기본요금
		 */
		if(age >= 65 || age <= 5) {
			rate = 0;
		}else if(age >= 19) {
			rate = 1;
		}else if(age >= 13) {
			rate = 0.75;
		}else if(age >= 6) {
			rate = 0.5;
		}
		
		//출력할 때 소수점X => 계산결과 실수를 정수로 변환
		//rate : 실수 => 계산결과 실수이기에 fee : 정수여서 에러발생 => int타입으로 변환 : 2000.0 ->2000
		fee = (int)(fee * rate); 	
		System.out.println("버스 요금: " + fee + "원입니다.");
		
		
		
		System.out.println("종료");
	}

}
