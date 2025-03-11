package ch01.ex01;

import java.util.Scanner;

/*
 * 반환O, 매개변수X
 */

public class Function03 {

	public static void main(String[] args) {
		
		String result = add();		//add() 함수 생성
		
		System.out.println("result = " + result);
	}
	
	//객체 생성하지 않을 때는 static 사용
	static String add() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine();	//변수에 입력받지 않고, 입력받은 값 바로 반환O
	}


}
