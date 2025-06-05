package practice;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Review_AggregateExample {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int[] arr = {};
		
		long count = Arrays.stream(arr).filter(n -> n%2 == 0).count();
		
		System.out.println("2의 배수 개수: " + count);
		
		int total = Arrays.stream(arr).filter(n -> n%2 == 0).sum();
		
		System.out.println("2의 배수 총합: " + total);
		
		OptionalDouble avg = Arrays.stream(arr)
									.filter(n -> n%2 == 0)
									.average();
		
		if(avg.isPresent()) {
			System.out.println("2의 배수 평균: " + avg.getAsDouble());
		}else {
			System.out.println("arr 배열 null값이기에 평균 구할 수 없음");
		}
		
		OptionalDouble avg2 = Arrays.stream(arr)
									.filter(n -> n%2 == 0)
									.average();
		
		double result = avg2.orElse(0.0);
		System.out.println(result);
	}
}
