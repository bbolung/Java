package ch04.ex01;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		
			int sum = 0; 	
			System.out.println("정수입력>> ");
			int num = sc.nextInt();
		
			for(int i=1; i<=num; i++) {
				if(i%2 == 1)	
				sum += i;
			}
			System.out.println(sum);
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 	
		System.out.println("정수입력>> ");
		int num = sc.nextInt();
		int i = 1;			//초기값
		
		while(i<=num) {		//조건
			if(i % 2 == 1) 	//1 ~ num까지 홀수합만 누적
				sum += i;
			i++;			//증감값
		}
		System.out.println(sum);
	}

}
