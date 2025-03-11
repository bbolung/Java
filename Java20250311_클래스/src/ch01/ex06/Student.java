package ch01.ex06;

public class Student {
	//인스턴스 변수(객체마다 다름)
	private String name;
	private int id;
	
	//정적 변수(모든 객체가 공유)
	private static int studentCount = 0;
	
	//생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		studentCount++;		//학생 객체가 생성될 때마다 studentCount 증가
	}
	
	//정적 메소드(전체 학생 수 반환)
	public static int getStudentCount() {
		return studentCount;
	}
	
	//인스턴스 메소드(학생 정보 출력)
	public void printInfo() {
		System.out.println("이름: " + name + ", 학번: " + id);
	}
	
}
