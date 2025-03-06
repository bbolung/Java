package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 number 배열[10] 전달하면
 * 배열값 : 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
 * 함수1은 배열값 사이 홀수합을 리턴하고
 * 함수2는 배열값 사이 짝수합을 리턴한다.
 * 배열값의 앞자리 숫자로 홀수, 짝수 판단
 * 메인함수에서 두 함수를 호출하고, 각 전달받은 값을 출력한다.
 */

public class FunctionExam02 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10;
		}
		
		for(int i=0; i<10; i++) 
			System.out.print(number[i] + " ");
		System.out.println();
		
		int resultA = evenSum(number);
		int resultB = oddSum(number);
		
		System.out.println("짝수합: " + resultA);
		System.out.println("홀수합: " + resultB);
		
		
	}
	
	public static int evenSum(int[] numA) {		//타입만 동일하면 되고 변수명은 상관없음
		int sum = 0;
		for(int i=0; i<numA.length; i++) {
//			System.out.print(numA[i] + " ");  --> 배열이 evenSum함수로 잘 전달되었는지 우선 확인!
			
			int num = numA[i] / 10;		//앞자리 숫자만 따로
			if( num % 2 == 0)			//앞자리 숫자가 짝수?  / if( (numA[i] / 10) % 2 == 0 )
				sum += numA[i];			//numA[i] = numA배열의 값
		}
		return sum;
	}
	
	public static int oddSum(int[] numB) {		// int[] : int형 배열
		int sum = 0;
		for(int i=0; i<numB.length; i++) {
			int num = numB[i] / 10;				// 몫 구하는 연산자 : /
			if(num % 2 == 1)					// 나머지 구하는 연산자: %
				sum += numB[i];
		}
		return sum;
	}
}
