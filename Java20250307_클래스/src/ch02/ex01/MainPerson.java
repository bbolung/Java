package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("뽀룽지");
		
//		p1.name = "뽀룽지";	-> 멤버변수는 private이기 때문에 외부 접근 불가
		
//		p1.run();			-> private이기 때문에 외부 접근 불가
		p1.eat();
		
		Person p2 = new Person("홍길동", 20, "010-1234-5678");
		
		p2. eat();
		
//		Person p3 = new Person();	-> 매개변수X = default 생성자 자동생성
		p2.name("까미");		//main메소드가서 코드를 보지 않으면 변수값 바꾸는 역할이라는 것을 모르고 메소드로 알 수 있음.
		p2.eat();			//메소드
		p2.setAge(100);		//class 확인하지 않아도 변수값 변경한다는 것을 직관적으로 알 수 있음.
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
	}

}
