package ch01.ex01;

/*
 * 반환O, 매개변수O
 */

public class Function02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);		//add(num1, num2) 함수 생성
		
		System.out.println("result = " + result);
		
	}
	
	//객체 생성하지 않을 때는 static 사용
	static int add(int n1, int n2) {
		return n1+n2;
	}


}
