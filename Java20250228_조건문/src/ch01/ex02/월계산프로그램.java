package ch01.ex02;

import java.util.Scanner;

/*
 * 문제 설명 :
 	사용자가 월을 입력하면 해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
 	계정은 다음과 같이 결정됩니다.:
 	
 	12월, 1월, 2월 : 겨울
 	3월, 4월, 5월 : 봄
 	6월, 7월, 8월 : 여름
 	9월 10월 11월 : 가을
 */

public class 월계산프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		String season = "";		// String season; 에러? => 초기 값이 없는데, if문에 포함되지 않는 값일 경우 출력하는 season에 값이 없기 때문
							// 처음에 String season = ""; : 초기 값 설정 / if문 마지막에 else { season = ""; } 없을 경우 값 설정 => 해결
		
		if(month == 12 || month <=2) {
			season = "겨울";
		}else if(month <= 5) {
			season = "봄";
		}else if(month <= 8) {
			season = "여름";
		}else if(month <= 11) {
			season = "가을";
		}
		
		System.out.printf("%d월은 %s입니다.\n", month, season);
		
	}

}
