package ex06;

import java.util.function.BiFunction;

//매개변수있고, 반환형 있는 경우
@FunctionalInterface
interface MaxInterface{
	int max(int num1, int num2);
}

public class Exam01 {

	public static void main(String[] args) {
		
		//익명클래스
		MaxInterface max1 = new MaxInterface() {
			@Override
			public int max(int num1, int num2) {
				return (num1 > num2) ? num1 : num2 ;
			}
		};
		
		//람다, {} 생략한 경우 return 생략
		MaxInterface max2 = (num1, num2) ->  (num1 > num2) ? num1 : num2 ;
		
		System.out.println(max1.max(5, 1));

		System.out.println(max2.max(5, 11));
		
		//java가 제공하는 인터페이스 사용!
		//public interface BiFunction<T, U, R>
		BiFunction<Integer, Integer, Integer> b1 = (a, b) -> a + b;
		
		int sum = b1.apply(10, 10);
		
		System.out.println(sum);
		
		
	}

}