package ch01.ex05;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산", 10);
		Person p2 = new Person("지리산", 30);

		System.out.println(p1.displayInfo());
		
		p1.count += 100;		//p1.count = p1.count + 100;
		
		System.out.println(p1.count);		//참조변수.정적변수; -> 정적? 인스턴스? 어떤 메소드인지 코드 확인 필요
		System.out.println(p2.count);
		System.out.println(Person.count);	//클래스명.정적변수;	-> 이 방식 주로사용(변수)
		
		p1.func();
		p2.func();
		Person.func();	//이 방식 주로 사용(메소드)
	
		
		
	}

}
