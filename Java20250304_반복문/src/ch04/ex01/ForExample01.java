package ch04.ex01;

public class ForExample01 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * for, while -> 조건을 만족하는 순간까지 계속 반복(조건 만족X -> 실행X)
		 * for -> 일반적으로 반복 횟수를 알 때 사용
		 * while -> 일반적으로 몇번 반복하는지 모를 때 사용
		 * do ~ while -> 조건을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}

