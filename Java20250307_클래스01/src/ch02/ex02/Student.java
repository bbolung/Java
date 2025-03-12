package ch02.ex02;

public class Student {
	
	private String name;
	private int grade;	//학년
	private int age;
	
	//생성자 만들 때는 습관적으로 default 생성자 만들고 시작하기
	public Student() {}
	
	//1. Student 객체생성하면서 이름(홍길동), 학년(3), 나이(20) 입력받은 것을 각 변수에 넣기
	public Student(String n, int g, int a) {
		name = n;
		grade = g;
		age = a;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
	}
	
	//3. 이름을 이순신으로 변경
	void setName(String n) {
		name = n;
	}
	
	//4. 변경된 이름만 출력
	String getName() {
		return name;
	}
	
	//5. 학년 5로 변경
	void setgrade(int g) {
		grade = g;
	}
	
	//6. 변경된 학년만 출력
	int getGrade() {
		return grade;
	}
}
