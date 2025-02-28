package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해 4000을 입력 받은 후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력 : 4000
		 * 출력 : 1시간 6분 40초
		 */
		
		Scanner sc = new Scanner(System.in );
		
		System.out.println("입력 : ");
		/*
		 * int, String 둘 다 사용가능
		 * String str = sc.nextLine();
		 * int totalSeconds = Integer.parseInt(str);
		 */
		int num = sc.nextInt();
		
		int hour = num / 3600;
		int minute = num % 3600 /60;
		int second = num - (hour*3600) - (minute*60);
		// 4000초를 60으로 나누면 분단위, 나머지가 남은 초 => int second = num % 60;
		System.out.println("출력 : " + hour + "시간 " + minute + "분 " + second + "초");
		
		
	}

}
