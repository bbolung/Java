package ch01.ex12;

import java.util.Scanner;

public class Pratice_1 {

	public static void main(String[] args) {
		//키보드로 입력받아 이름, 나이 출력
		
/*		Scanner sc1 = new Scanner(System.in);
 * 		System.out.println("이름 입력: ");
 * 		String name1 = sc1.nextLine();
 * 		System.out.println("이름: " + name1);
 * 		Scanner sc2 = new Scanner(System.in);	=> 두번 입력할 필요X
 * 		System.out.println("나이 입력: ");
 * 		int age1 = sc2.nextInt();
 * 		System.out.println("나이: " + age1);
 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		
		String name = sc.nextLine();
		System.out.println("이름: " + name);
		
		
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		
		
		
		
		
	}

}
