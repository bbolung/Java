package ch04.ex01;

import java.util.Scanner;

public class ForExample05_배열05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//예시 >> int num = 0;
		//7명의 학생 점수 배열 생성, 일일이 입력받지X 처음부터 입력 후 실행
		int[] student  = new int[]{-1, -3, -700, 1, 2, 9, 3};	
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<7; i++) {
			sum += student[i];
		}
		
		average = sum/7.0;
		
		System.out.printf("총점: %d, 평균: %.2f\n", sum, average);
		System.out.println("7번째 값 출력: " + student[6]);
		
		System.out.println("----------------------------------");
		
		//배열에서 최대값, 최소값 구하기
		//max와 min에 배열 첫번째 값을 넣으면 따로 설정할 필요없이 최대값, 최소값 구할 수O
		int max;
		int min;
		max = student[0];
		min = student[0];
		
		for(int i=0; i<7; i++) {
		//max : 배열 중 가장 큰 값보다는 작은 값을 변수 선언해야 배열에서 최대값 구할 수O
			if(max < student[i]) {	
				max = student[i];
			}	
		/*
		 * why 최소값: 0 
		 * => 변수 초기값에서 0으로 설정하였는데, 0보다 작은 값이 배열에 없기 때문
		 * => int min에 최소값보다 큰 값을 넣으면 됨. 최소값보다 작은 값이 들어가면 최소값 안나옴.
		 */
			if(min > student[i]) {		
				min = student[i];
			}
		}
		
		System.out.println("최대값: " + max);		//100
		System.out.println("최소값: " + min);		//33
		
		System.out.println("----------------------------------");
		
		/*
		 * {-1, -3, -700, 1, 2, 9, 3}
		 * 키보드 : 1 입력 -> 출력: 1값은 4번째 위치입니다.
		 * 키보드 : -3 입력 -> 출력: -3값은 2번째 위치입니다. 
		 * 반복문, 조건문 이용
		 */
		
		int index = -1;		//위치값 변수 선언
		System.out.println("찾을 숫자를 입력>>");
		int numA = sc.nextInt();
		
		//for문은 if조건을 만족하는 값을 찾아도 i: 0~6까지 모두 실행해봐야 하고, 7이 되자마자 실행문 실행하지 않고 빠져나옴
		for(int i=0; i<7; i++) {	
			if(numA == student[i]) {
				index = i;
				break; 	//for문이 i범위에 상관없이 조건만족하면 바로 종료
			}
		}
		//index != -1 => index = i => student[i] 값 출력, index != 0 => 이렇게 설정하면 student[0]값이 출력되지 못함
		//꼭 -1이 아니어도 음수값이면 상관없음
		//index == -1 => if 조건문을 만족하는 값을 찾지 못했다는 뜻
		if(index != -1)		
			System.out.printf("%d값은 %d번째 위치입니다.\n", numA, index+1);
		else
			System.out.printf("%d값을 찾을 수 없습니다.\n", numA);
		//실행문이 하나일 경우 {} 생략가능
		
		System.out.println("----------------------------------");
		
		/*
		 * {-1, -3, -700, 1, 2, 9, 3}
		 * 위의 값을 정렬(sort)해서 출력하기 -> {-700, -3, -1, 1, 2, 3, 9}
		 */
	}

}
