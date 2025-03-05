package ch01.ex04;

import java.util.Scanner;

public class 통장관리02 {

	public static void main(String[] args) {
		//If문 사용
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;		//잔고
		boolean flag = false;	//false -> while문 계속 실행, true -> while문 빠져나옴 수단
		
		while(true) {
			
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.println("선택>");
			//nextLine() 사용하라고 했으니까 문자열 -> 정수형 int로 변경
			int num = Integer.parseInt(sc.nextLine()); 	
			
			if(num == 1) {
				System.out.println("예금액>");
				balance += Integer.parseInt(sc.nextLine());	//입력받은 값을 잔고에 누적(+)
			}else if(num == 2) {
				System.out.println("출금액>");
				balance -= Integer.parseInt(sc.nextLine());	//입력받은 값을 잔고에 누적(-)
			}else if(num == 3) {
				System.out.println("잔고>");
				System.out.println(balance);
			}else if(num == 4) {
				break;
			}
		} //while
		System.out.println("프로그램 종료");
			
//			sc.nextLine(); -> 버퍼지우기(엔터키 지워라) -> switch문 밖에 작성
//			balance += sc.nextInt(); 사용하면 버퍼가 남아서 에러발생
		
		
		
	}

}
