package ex06;

import java.util.Arrays;
import java.util.OptionalDouble;

/*
 * null값일 경우 Error 방지하는 것이 중요!
 */

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int[] arr = {};
		
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수 개수 : " + count);
		
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sum();
		System.out.println("2의 배수 총합 : " + sum);
		
		//average(): 반환타입 OptionalDouble(null값인 경우도 포함된 실수)
	    OptionalDouble avg = Arrays.stream(arr)
									.filter(n->n%2==0)	//2,4,6,8,10 => avg = 5.0
									.average();			//
	    
	    if(avg.isPresent()) {
	    	System.out.println("2의 배수 평균: " + avg.getAsDouble());
	    }else {
	    	System.out.println("arr 배열 null값이기에 평균 구할 수 없음");
	    }
	    
	    
	    /*
	     * arr가 null값일 경우 Error 발생 
	     => OptionalDouble 사용하여 null값일 경우 Error 방지
	     
		    double avg2 = Arrays.stream(arr)
		    					.filter(n -> n%2 == 0)		//2,4,6,8,10 => avg = 5.0
		    					.average().getAsDouble();	//double 반환
		    System.out.println("Double 2의 배수 평균: " + avg2);
	    */
		
		OptionalDouble avg3 = Arrays.stream(arr)
									.filter(n -> n%2 == 0)
									.average();
		
		double result = avg3.orElse(0.0);	//avg3 = null값일 경우 0.0 반환
		System.out.println(result);
		
		
		
	}

}