package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수X, 반환O 
 */

public class Add03 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		int result = add();
		
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	public static int add() {
		
		System.out.println("add() 시작");
		
		//매개변수X -> add함수에서 변수선언O
		int num1 = (int)(Math.random()*100)+1;	//num1 : 1~100 중 랜덤한 정수값
		int num2 = (int)(Math.random()*100)+1;
		int sum = num1 + num2;

		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		return sum;
		
		
	}

}
