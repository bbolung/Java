package ch01.ex02;

//			 클래스명 -> 첫글자 대문자
public class Person {
	
	//필드, 인스턴스 변수
	String name;
	String phone;
	int age;
	int kor;
	int eng;
	int math;
	
	//메소드, 인스턴스 메소드
	void 나이출력(int age) {
		System.out.println("나이 : " + age);
	}
	
	void 전화번호출력(String phone) {
		System.out.println("전화번호 : " + phone);
	}
	
	void 이름출력(String name) {
		System.out.println("이름은 " + name);
	}
	
	void 공부하기(String name) {
		System.out.println(name + " 공부하기");
	}
	
	void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		System.out.println("세 과목의 합: " + sum);
	}
}
