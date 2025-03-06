package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수X, 반환X 
 */

public class Add01 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		add();
		
		System.out.println("프로그램 종료!");
	}
	
	public static void add() {
		
		System.out.println("add() 시작");
		
		int num1 = (int)(Math.random()*100)+1;	//num1 : 1~100 중 랜덤한 정수값
		int num2 = (int)(Math.random()*100)+1;
		
		//" = " + num1 => num1 문자열로 취급, => num1num2 이렇게 문자열로 나옴
		//num1+num2 합계로 구하려면 -> (num1+num2) 묶어주기
		System.out.println(num1 + " + " + num2 + " = " + num1+num2);
		System.out.println( num1 + " + " + num2 + " = " + (num1+num2) );
		
	}

}
