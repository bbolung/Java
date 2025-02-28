package ch02.sec09;

public class OperationPromtionExam {

	public static void main(String[] args) {
		// double > float > long > int > short > byte
		
		int a = 10;
		int b = 3;
		String c = "korea";
		String d = "9";
		int num1 = 9;
		System.out.println(a / b); // 정수와 정수 연산 => 정수
		System.out.println((double)a / b); // 3.333 도출하려면 a1, b1 중 하나 실수로 강제타입변환
		System.out.println(a + c); // 정수+문자 => 문자열
		System.out.println(d + num1); // 정수+문자 => 문자열
		
		
		byte result1 = 10+20;
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; // byte, short => int로 자동타입변환
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; // long 타입이 int보다 크기 때문에 long으로 자동타입변환
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4); // int 타입으로 변환 => 정수
		System.out.println("result4: " + (char)result4); // char 타입으로 변환 => B
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5); // 정수 연산 => 정수
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6); // double 타입으로 변환 후 연산 => 실수
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; // double 타입으로 변환 후 연산 => 실수
		System.out.println("result7: " + result7);
	}

}
