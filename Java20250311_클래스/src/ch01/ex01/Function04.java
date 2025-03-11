package ch01.ex01;

import java.util.Scanner;

/*
 * 반환X, 매개변수X
 */

public class Function04 {

	public static void main(String[] args) {
		
		add();		//add() 함수 생성, return값이 없기 때문에 변수선언X
		
		System.out.println("result = ");
	}
	
	//객체 생성하지 않을 때는 static 사용
	//void : 반환타입X
	static void add() {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		
		String name = sc.nextLine();
		System.out.println(name);
//		System.out.println(sc.nextLin());	-> 한줄로 정리O
		
		return;	//return;을 아예 지우거나 값을 대입X
	}

}
