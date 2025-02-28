package ch01.ex02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
	
		//키보드 통해서 입력받기!
		
				System.out.print("문자 값 입력 : ");
				
				Scanner sc = new Scanner(System.in);
				
				//str 값 + 10 출력 => String str = sc.nextLine(); 문자열 식을 아래처럼 int형으로 변환
				
				int str = Integer.parseInt(sc.nextLine()); //문자열을 기본 타입으로 변환
				str = str + 10; //출력하고자 하는 조건
				
				System.out.println("입력된 값 : " + str);
		
		
	}

}
