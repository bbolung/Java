package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		//Arrays.stream(arr): arr의 배열을 흐름 넣음
		//.filter(n -> n%2 == 1): 스트림에서 요소를 하나씩 꺼내서 조건 검사(홀수만 필터링)
		int total = Arrays.stream(arr).filter(n -> n%2 ==1).sum();
		
		System.out.println(total);		//홀수의 합
		
		//.filter(i -> i%3 == 0): 하나씩 받은 값을 3으로 나눠서 나머지가 0인 값만 필터링
		long count = Arrays.stream(arr).filter(i -> i%3==0).count();
		
		System.out.println(count);		//3의 배수의 개수
		
		//.forEach(n -> System.out.print(n + " ")): 하나씩 받은 값을 공백을 포함해서 하나씩 출력
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		/*
		 * total 람다식 익명 클래스 형태로 풀어서 작성
			기본형 int 다루는 함수형 인터페이스, int값 받아서 true/false 반환
			IntPredicate filter = new IntPredicate() {
				@Override
				public boolean test(int n) {
					return n % 2 == 1;
				}
			};
			
			int total = Arrays.stream(arr).filter(filter).sum();
		*/
	}

}