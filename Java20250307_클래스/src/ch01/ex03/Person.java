package ch01.ex03;

//			 클래스명 -> 첫글자 대문자
public class Person {
	
	//필드, 인스턴스 변수
	//변수 타입 앞에 private -> 내부에서만 변수 직접 호출O, 외부에서 직접 호출X
	private String name;
	String phone;
	int age;
	int kor;
	int eng;
	int math;
	
	/*
	 * 생성자 : 깂 초기화할 목적
	 * 생성자 없으면 외부클래스에서 변수에 값을 대입X(또는 getter/setter 사용하는 방법)
	 */
	
	public Person(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
	
	//생성자 만들지 않으면 자동으로 default 생성자(인자값X) 생성
	public Person() {
		System.out.println("void Person()");
	}
	
	//메소드, 인스턴스 메소드
	void 나이출력() {
		System.out.println("나이 : " + age);
	}
	
	void 전화번호출력() {
		System.out.println("전화번호 : " + phone);
	}
	
	void 이름출력() {
		System.out.println("이름은 " + name);
	}
	
	void 공부하기() {
		System.out.println(name + " 공부하기");
	}
	
	void 시험보기() {
		int sum = kor + eng + math;
		System.out.println("세 과목의 합: " + sum);
	}
}
