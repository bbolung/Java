package ch01.ex02;

public class SwitchExam01 {

	public static void main(String[] args) {
		//IfExam05 동일한 문제
		//Switch문
		
		/*
		 * 학점(grade)
		 * 90이상 : A
		 * 80이상 : B
		 * 70이상 : C
		 * 60이상 : D
		 * 59이하 : F
		 */
		
		int grade = 85;
		
		switch(grade/10) { 	//case 옆 숫자에 변수가 해당하면 출력 => grade/10하면 case 옆 숫자에 해당됨
		case 10:
			System.out.println("A");
			break;				//break 없으면 해당되는 곳에서부터 아래 모두 출력(85 -> B, C, D, F, 종료)
		case 9:
			System.out.println("A");
			break;
/*	
 * 출력값이 동일하기에 이렇게도 작성가능
 * 		case 10:
 * 		case 9:
			System.out.println("A");
			break;
 */
		
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		System.out.println("종료");
	}

}
