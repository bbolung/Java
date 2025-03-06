package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수O, 반환X 
 */

public class Add02 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		//매개변수O -> main함수에서 변수선언해야 함
		int num1 = (int)(Math.random()*100)+1;	//num1 : 1~100 중 랜덤한 정수값
		int num2 = (int)(Math.random()*100)+1;
		
		add(num1, num2);	//랜덤하게 입력받은 값을 함수에게 입력
		
		System.out.println("프로그램 종료!");
	}
	
	public static void add(int numA, int numB) {
		
		System.out.println("add() 시작");
		
		System.out.println(numA + " + " + numB + " = " + numA+numB);
		System.out.println( numA + " + " + numB + " = " + (numA+numB) );
		
	}

}
