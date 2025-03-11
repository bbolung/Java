package ch01.ex01;

/*
 * 반환O, 매개변수O
 */

public class Function01 {

	public static void main(String[] args) {
		//main() : 객체 생성 -> 함수 사용가능
		Function01 f1 = new Function01();	
		
		int num1 = 10;
		int num2 = 20;
		
		//add(num1, num2) 함수 생성, main()에서는 항상 객체 생성을 해야 함.
		int result = f1.add(num1, num2);		
		
		System.out.println("result = " + result);
		
	}
	
	int add(int n1, int n2) {
		return n1+n2;
	}


}
