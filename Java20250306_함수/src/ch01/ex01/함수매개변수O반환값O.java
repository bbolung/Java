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

public class 함수매개변수O반환값O {
	/*
	 * main 함수 진입
	 * 함수호출 -> void sum() 함수로 이동 -> 실행
	 * 다시 main 함수로 돌아와 나머지 실행
	 */
	
	
	public static void main(String[] args) {	//main함수 : 없으면 동작 못함
		//sum(10, 20);	-> 함수호출, return 반환값O but 출력X
		int result = sum(10,20);	//return 반환값 출력, return 타입과 아래 함수 타입과 동일한 타입으로
		//int result = 30;  	--> 이렇게 나옴
		System.out.println(result);
		System.out.println("프로그램 종료!!");
		
		
	}

	//void : 반환값이 없다는 뜻
	//return 타입과 함수 타입 일치해야 함(int)
	public static int sum(int num1, int num2) {			//함수 정의
		//코드 구현
		System.out.println("int sum(int num1, int num2) 함수 호출!!");
		
		return num1 + num2; 	//return : 값을 반환한다.(num1+num2 => 정수값)
		
	}
	
}
