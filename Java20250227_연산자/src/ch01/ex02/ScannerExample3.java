package ch01.ex02;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX); //입력한 x 값을 문자열 -> 정수로 변환 => 정수만 입력
		
		System.out.print("y 값 입력: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY); //입력한 y 값을 문자열 -> 정수로 변환 => 정수만 입력
		
		int result = x + y;
		System.out.println("x + y: "+ result);
		System.out.println(); //한 줄 띄어쓰기
		
		//중괄호{"입력 문자열:", "출력 문자열: "} 안을 무한히 반복 실행
		while(true) {
			System.out.print("입력 문자열: ");
			String data = sc.nextLine();
			if(data.equals("q")) { //입력된 문자열이 q라면 반복 중지("종료")
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println(); //한 줄 띄어쓰기
		}
		
		System.out.println("종료");
	}

}		
