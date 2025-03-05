package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {
		//정렬01과 동일한 문제, random class 사용
		
		/*
		 * seed값을 넣어주면 랜덤숫자가 일정하게 나온다. => random class만 가능
			int seed = 12345;
			Random random = new Random(seed); 
		 */
		
		Random random = new Random();	//객체생성
		
		int[] numArr = new int[10];
		int tmp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다.
		//매번 배열 길이 수정X -> numArr.length 이용
		for(int i=0; i<numArr.length; i++) {
			tmp = (int)random.nextInt(100) + 1;
			numArr[i] = tmp;
		}
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		
		System.out.println();
		System.out.println();

		//최대값, 최소값 출력
		int max, min;
		max = numArr[0];
		min = numArr[0];
		//max = min = numArr[0]; 이렇게 작성도 가능
		
		//int i=1 : i =0이어도 상관없지만 이미 numArr[0]이 포함되어 있기에 굳이 의미X
		for(int i=1; i<numArr.length; i++) {	
			if(max < numArr[i]) {
				max = numArr[i];
			}
			if(min > numArr[i]) {
				min = numArr[i];
			}
		}
		
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
		System.out.println();
		
		//총점, 평균
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i];
		}
		
		avg = (double)sum/numArr.length;		//정수/정수 = 정수  => 강제타입변환 필요!
		
		System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
		
		System.out.println();
		
		//정렬~(버블정렬)
		int temp;
		
		//회전반복용도
		for(int i=0; i<numArr.length; i++) {	
			//두개의 값 비교용도
			for(int j=0; j<numArr.length-1-i; j++) {	//-1: 마지막 변수 비교대상X, -i: 회전할수록 뒷자리 하나씩 고정 -> 굳이 불필요한 계산반복X
				if(numArr[j] > numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

}
