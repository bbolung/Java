package ch01.ex07;

import java.util.function.Function;

public class AccuracyExam2 {

	public static void main(String[] args) {

		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		func();
		
	}

	public static void func() {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
						// 1 - 0.7 = 0.3
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	//실수는 정확한 계산에 사용하지 않는 것이 좋음.
	}
	
	
}
