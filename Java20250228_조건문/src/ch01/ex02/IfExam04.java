package ch01.ex02;

public class IfExam04 {

	public static void main(String[] args) {
		// if ~ else => 아래처럼 많은 경우의 수에는 사용X(가독성 떨어짐)
		/*
		 * 학점(grade)
		 * 90이상 : A
		 * 80이상 : B
		 * 70이상 : C
		 * 60이상 : D
		 * 59이하 : F
		 */
		
		int grade = 46;
		
		if(grade >= 90) {
			System.out.println("A");
		}else {
			if(grade >= 80) {
				System.out.println("B");
			}else {
				if(grade >= 70) {
					System.out.println("C");
				}else {
					if(grade >= 60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		}
		
		System.out.println("종료");
	}

}
