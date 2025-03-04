package ch04.ex01;

import java.util.Scanner;

public class ForExample05_배열04 {

	public static void main(String[] args) {
		//7명 학생 점수 입력받아서, 총점, 평균 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] student  = new int[7];	//7명의 학생 점수 배열 생성
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<7; i++) {
			System.out.println( (i+1) + "번 학생 자바 점수>>");
			student[i] = sc.nextInt();			//키보드 입력받은 점수 student[i]에 순서대로 저장
			sum += student[i];
		}
		
		average = sum/7.0;
		
		System.out.printf("총점: %d, 평균: %.2f\n", sum, average);
		
	}

}
