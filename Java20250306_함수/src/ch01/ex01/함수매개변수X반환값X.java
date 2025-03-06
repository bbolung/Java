package ch01.ex01;

/*
 * ----------함수-----------
 * 입력(매개변수)	출력(반환값)
 * 	  O			   O
 *    O			   X
 *    X			   O
 *    X			   X
 *    
 * 함수 정의 : 함수 만드는 것
 * 함수 호출 : 만든 함수를 실행하는 것	
 */

public class 함수매개변수X반환값X {

	public static void main(String[] args) {	//main함수 : 없으면 동작 못함
		sum();	//함수호출 -> void sum() 함수로 이동 -> 출력 -> main함수로 돌아와 출력
		System.out.println("프로그램 종료!!");
		
		
	}

	
	public static void sum() {			//함수 정의
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
	}
	
}
