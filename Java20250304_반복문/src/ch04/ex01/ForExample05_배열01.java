package ch04.ex01;

import java.util.Scanner;

public class ForExample05_배열01 {

	public static void main(String[] args) {
		//책 p.167
		//5명 점수를 입력 받아서, 총점, 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//메모리 각각 5개 잡아서 계산
		System.out.println("1번학생 자바 점수>>");
		int numA = sc.nextInt();
		
		System.out.println("2번학생 자바 점수>>");
		int numB = sc.nextInt();
		
		System.out.println("3번학생 자바 점수>>");
		int numC = sc.nextInt();
		
		System.out.println("4번학생 자바 점수>>");
		int numD = sc.nextInt();
		
		System.out.println("5번학생 자바 점수>>");
		int numE = sc.nextInt();
		
		int sum = numA + numB + numC + numD + numE;
		double average = sum/5.0;
		
		System.out.printf("총점: %d, 평균: %.2f\n", sum, average);
	}

}
