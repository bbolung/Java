package ex01;

public class UniversityStudent extends Student {
	private String major;	//전공
	private boolean isInterns;	//인턴여부?
	private int scholarshoip;	//장학금
	
	void registerCourse() {} 	//수강신청
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + major + "전공하고 있는 " + getName() + "입니다.");
	}
}
