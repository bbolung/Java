package ch01.ex02;

public class DoWhile01 {

	public static void main(String[] args) {
		//for문
		int sum = 0;
		for(int i=1; i<=100; i++)
			sum += i;
		System.out.println(sum);
		
		//while문
		int sum2 = 0;
		int i = 1;
		while(i<=100) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
		
		/*
		 * do~while문
		 * 조건(while)이 거짓이어도 실행문(do) 한 번은 실행함.
		 * do에서 실행문 실행 후 while에서 조건 확인 -> 참이면 계속 실행, 거짓이면 종료
		 */
		
		int sum3 = 0;
		int j = 0;		//초기값
		do {
			j++;		//증가,변동값
			sum3 += j;
		}while(j<100);	//조건
		System.out.println(sum3);
		
	}

}
