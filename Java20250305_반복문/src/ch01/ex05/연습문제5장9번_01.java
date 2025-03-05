package ch01.ex05;

import java.util.Scanner;

public class 연습문제5장9번_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			
			System.out.println("선택>");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				System.out.println("학생수>");
				int student = Integer.parseInt(sc.nextLine());
				break;
			case 2:
					
				break;
			case 3:
				break;
			case 4:
				break;
				
			} //switch
			
		} //while
		
		
	}

}
