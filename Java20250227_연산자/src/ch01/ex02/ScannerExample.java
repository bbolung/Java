package ch01.ex02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		//키보드 통해서 입력받기!
		
				System.out.print("문자 값 입력 : ");
				
				Scanner sc = new Scanner(System.in);
				
				// nextLinge : 콘술에 정수, 문자 상관X 입력, string으로 출력되기에 String으로 변수선언
				String str = sc.nextLine(); 
				System.out.println("입력된 값 : " + str);
				
				System.out.println("정수 입력 : ");	
				
				// nextInt : 콘솔에 정수만 입력가능, int로 출력되기에 int로 변수선언
				int num = sc.nextInt(); 
				System.out.println("입력된 값 : " + num);		
		
		
		
		
	}

}
