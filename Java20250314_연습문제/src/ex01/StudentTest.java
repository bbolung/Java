package ex01;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		students[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		students[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		for(int i=0; i<students.length; i++) {
			String result = students[i].printInformation();
			System.out.println(result);
//		System.out.println(students[i].printInformation());
//			System.out.println(students[i]); -> toString() 메소드 사용할 때는 for문 안에 이것만 출력
		}
	}

}
//arrays에서 메소드 호출 안되는 이유? -> 배열이기에 arrays[0]. 이렇게 호출