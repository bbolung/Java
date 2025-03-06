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

public class 함수매개변수O반환값X {
	/*
	 * main 함수 진입
	 * 함수호출 -> void sum() 함수로 이동 -> 실행
	 * 다시 main 함수로 돌아와 나머지 실행
	 */
	
	//인자값과 매개변수 타입, 개수, 순서 모두 일치해야 함
	
	public static void main(String[] args) {	//main함수 : 없으면 동작 못함
		sum(10, 10.2);	//함수호출, 10 = 인자값
		System.out.println("프로그램 종료!!");
		
		
	}


	public static void sum(int num, double dnum) {			//함수 정의, int num = 매개변수
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
		System.out.println(num + dnum);
	}
	
}
