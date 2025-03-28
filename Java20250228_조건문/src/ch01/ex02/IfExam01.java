package ch01.ex02;

public class IfExam01 {

	public static void main(String[] args) {
		
		/*
		 * 조건문
		 * if문 
		 * 1. if : 조건 만족X -> 출력 없음
		 * 2. if ~ else
		 * 3. if ~ else if ~ else : 경우의 수가 많을  때(else if 무제한 반복가능)
		 * 
		 * swich문(if ~ else if ~ else 좀 더 간단하게 사용한 조건문)
		 */
		
		int kor = 69;
		
		if(kor >= 70) {					//if 조건 만족O -> "합격" 출력, 만족X -> if문 생략
			System.out.println("합격"); 
			System.out.println("합격"); 
			System.out.println("합격"); 
		}
		
		if(kor < 70 ) {
			System.out.println("불합격");
			System.out.println("불합격");
			System.out.println("불합격");
		}
		
		System.out.println("종료");
		
	}

}
