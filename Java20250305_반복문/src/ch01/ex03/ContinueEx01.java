package ch01.ex03;

public class ContinueEx01 {

	public static void main(String[] args) {
		//1~100사이에서 홀수 합 구하기
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i % 2 ==1) sum += i;			//홀수만 sum에 누적하겠다는 뜻
		}
		
		System.out.println(sum);
		
		//1~100사이에서 홀수 합 구하기 -> continue 사용
		int sum2 = 0;
		for(int i=0; i<=100; i++) {
			if(i % 2 == 0) continue;		//짝수인 경우 다음 실행문 실행X -> 다시 for문 처음으로 이동하여 반복
			sum2 += i;						//홀수인 경우 if문 조건만족X -> sum2 += i; 실행
		}
		
		System.out.println(sum2);
	}

}
