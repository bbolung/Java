package ch04.ex01;

public class ForExample02 {

	public static void main(String[] args) {
		//블럭만 수정
		//1~100까지 홀수 합
		int sum = 0;
		
		for(int i=1; i<=100; i++) {		//1~100까지 반복
			if(i % 2 == 1) { 	//홀수?
				sum += i;		//홀수이면 누적
			}
		}
		
		System.out.println("sum = " + sum);

	}

}

		