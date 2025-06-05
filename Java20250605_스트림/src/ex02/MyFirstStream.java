package ex02;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		//문자열 길이값 출력(for문 사용)
		String[] arr = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		for(String str : arr) {
			System.out.print(str.length() + " ");
		}
		System.out.println();
		
		//문자열 길이값 출력(Stream API 사용)
		//n: 문자열이 들어있음("AA", "BBB"...)
		//map(): 스트림의 각 요소를 하나씩 꺼내서 새로운 값으로 바꿈
		Arrays.stream(arr)
			.map(n-> n.length())
			.forEach(n-> System.out.print(n + " "));
		
		//n: 문자열이기에 정수열로 변환 후 sum() 구할 수 있음
		int total = Arrays.stream(arr)
				.mapToInt(n->n.length())
				.sum();
		
		System.out.println("\n" + total);
		
	}

}