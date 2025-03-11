package ch01.ex06;

/*
 * 출력 결과
   이름: 김철수, 학번: 101
   이름: 이영희, 학번: 102
   이름: 박민수, 학번: 103
   전체 학생 수: 3
 */

public class MainStudent {

	public static void main(String[] args) {
		Student s1 = new Student("김철수", 101);
		Student s2 = new Student("이영희", 102);
		Student s3 = new Student("박민수", 103);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		//정적 메소드 호출(클래스명으로 직접 접근)
		System.out.println("전체 학생 수: " + Student.getStudentCount());
	}

}
