package ch01.ex02;

public class IfExam05 {

	public static void main(String[] args) {
		//if ~ else if ~ else => 참인 경우 바로 빠져나옴. 나머지 조건문 생략
		
		/*
		 * 학점(grade)
		 * 90이상 : A
		 * 80이상 : B
		 * 70이상 : C
		 * 60이상 : D
		 * 59이하 : F
		 */
		
		int grade = 96;
		
		if(grade >= 90) {
			System.out.println("A");
		}else if(grade >= 80) {
			System.out.println("B");
		}else if(grade >= 70) {
			System.out.println("C");
		}else if(grade >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("종료");
	}

}
