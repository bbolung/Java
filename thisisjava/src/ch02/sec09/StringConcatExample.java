package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		// 숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
		// 결합 연산
		String result2 = 10 + 2 + "8"; 
		// 1차 => 10 + 2 = 12
		// 2차 => 12 + "8" -> "12" + "8" = "128"
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8; 
		// 1차 => 10 + "2" -> "10" + "2" = "102"
		// 2차 => "102" + 8 -> "102" + "8" = "1028"
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;
		// 1차 => "10" + 2 -> "10 + "2" = "102"
		// 2차 => "102" + 8 -> "102" + "8" = "1028"
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		// 1차 => 2 + 8 = 10
		// 2차 => "10" + 10 -> "10" + "10" = "1010"
		System.out.println("result5: " + result5);
		
		
		// 문자열 기본 타입으로 변환
		String str = "10";
		int num = Integer.parseInt(str) + 1;
		System.out.println(num);
	}

}
