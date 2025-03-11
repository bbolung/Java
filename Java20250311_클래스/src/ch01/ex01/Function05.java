package ch01.ex01;

import java.util.Scanner;

/*
 * 반환X, 매개변수O
 */

public class Function05 {

	public static void main(String[] args) {
		
		add(1.5);		//add() 함수 생성, return값이 없기 때문에 변수선언X, 매개변수O
		
		System.out.println("result = ");
	}
	
	//객체 생성하지 않을 때는 static 사용
	//void : 반환타입X
	static void add(double dNum) {	

		System.out.println(dNum);	
		
		return;	//return;을 아예 지우거나 값을 대입X
	}

}
