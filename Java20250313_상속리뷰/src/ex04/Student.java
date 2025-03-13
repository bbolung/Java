package ex04;

public class Student extends Person {
	private String schoolName;
	private int grade;	//학년
	
	Student() {}
	Student(String name, int age, String schoolName, int grade) {
		super(name, age);
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	void study() {
		System.out.println("study.....");
	}
	
	@Override
	public String toString() {
		return "Student [schoolName = "  + schoolName + ", grade = " + grade +"] 입니다.";
	}
	
	@Override
	void introduce() {
		System.out.println("안녕하세요. 저는 " + schoolName + "에 다니는 " + grade + "학년 " + getName() + "입니다.");
	}
	
}
