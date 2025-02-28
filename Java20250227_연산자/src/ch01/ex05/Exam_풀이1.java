package ch01.ex05;

import java.util.Scanner;

public class Exam_풀이1 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해 4000을 입력 받은 후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력 : 4000
		 * 출력 : 1시간 6분 40초
		 */
		
		Scanner sc = new Scanner(System.in );
		System.out.println("숫자 입력 : ");
		String str = sc.nextLine();
		int totalSeconds = Integer.parseInt(str);
		
		int hours = totalSeconds / 3600; 	// 1시간 구함
		//System.out.println(hours); => 확인
		int minutes = totalSeconds % 3600 / 60; 	// 6분 구함
		//System.out.println(minutes); => 확인
		int seconds = totalSeconds % 60; 	//40초 구함
		//System.out.println(seconds); => 확인
		
		System.out.printf("total 초 : %d, 시간 : %d, 분 : %d, 초:%d\n", totalSeconds, hours, minutes, seconds);
		
		
	}

}
