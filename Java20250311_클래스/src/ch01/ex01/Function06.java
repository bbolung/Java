package ch01.ex01;

import java.util.Scanner;

/*
 * 메소드 자동생성
 */

public class Function06 {

	public static void main(String[] args) {
		
		add(1.5);		//add() 함수 생성 -> 만들지 X 빨간 줄 -> 클릭 -> 자동생성O
		
		int result = add2(1.5);
		
		int result2 = add3();
		
		System.out.println("result = ");
	}
	//자동생성된 메소드

	private static void add(double d) {		//return타입X, 매개변수O
	}
	
	private static int add2(double d) {		//int로 return, 매개변수O
		return 0;
	}
	
	private static int add3() {		//int로 return, 매개변수X
		return 0;
	}

}
