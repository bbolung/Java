package ex06;

import java.util.function.BiFunction;

/*
 * 숫자 2개 전달하면 문자열로 반환
 */

public class Exam07 {

	public static void main(String[] args) {
		
		//Integer 입력값 2개 받아서 String으로 출력                        문자열로 변환 알려줌(없어도 자동 변환됨)
		BiFunction<Integer, Integer, String> biFunction = (n1,n2) -> String.valueOf("" + n1 + n2 );
		
		
		String str = biFunction.apply(10, 20);
		System.out.println(str);
	}
}









