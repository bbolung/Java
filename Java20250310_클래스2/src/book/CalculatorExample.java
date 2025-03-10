package book;

/*
 * 결과
 	result1 : 314.159
 	result2 : 15
 	result3 : 5
 * 
 * 정적 요소
 	pi(3.14159)
 	int plus(int x, int y){
 		return x + y;
 	}
 	int minus(int x, int y){
 		return x - y;
 	}
 */

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}

}
