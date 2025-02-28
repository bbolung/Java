package ch01.ex12;

import java.util.Scanner;

public class Pratice_2 {

	public static void main(String[] args) {
		//키보드로 입력받아 이름, 나이 출력
		

		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력: ");
		
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		sc.nextLine(); 	//버퍼 클리어 => 없을 경우 나이 출력 후 이름 입력:, 바로 이름: 출력됨.
		
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("이름: " + name);
		
		
		
	}

}
