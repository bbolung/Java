package ex02;

public class MainPerson {

	public static void main(String[] args) {
		//객체생성
		UniversityStudent u1 = 
				new UniversityStudent("지리산", 20, "한체대", 3, "전산");
		u1.introduce();
		
		Person p1 = new Person("내장산", 20);
		p1.introduce();
		
		Student s1 = new Student("치악산", 15, "천호초등학교", 3);
		s1.introduce();
		
		System.out.println("---------------------------------------------");
		
		//object는 모든 class의 상위클래스
		System.out.println(p1); 			//ex02.Person@6d311334 : @주소값
		System.out.println(p1.toString());	//ex02.Person@6d311334 : 변수@주소값 재정의
		System.out.println(u1.toString());
		System.out.println(s1.toString());
		
		System.out.println("-------상위 클래스는 하위 클래스 참조 가능-------");
		
		//상위클래스가 하위클래스 참조
		Person p2 = new Student();
		
		Student s2 = new UniversityStudent();
		
		System.out.println("-------하위 클래스는 상위 클래스 참조 불가-------");
		
//		Student s3 = new Person();	-> 허용X (허용되면 s3의 기능이 제한되기 때문에)
		
		System.out.println("-------하위 클래스는 상위 클래스 참조 가능-------");
		
		Person p4 = new Student();
		Student s4 = (Student)p4; 	//가능 (s4의 기능에 제한X 때문)
		
		p4 = new Person();
//		s4 = (Student)p4;	-> 불가 (s4의 기능 제한O)
		
		p4 = new UniversityStudent();
		s4 = (Student)p4;			//가능
		
		System.out.println("-----다 형 성 -> 자동 타입 변환 + 오버라이딩-----");
		
		//어떤 클래스를 참조하느냐에 따라 출력값이 달라짐
		Person p5 = new Person();		//참조 클래스 : Person
		p5.sleep(); 
		p5.introduce(); 				//Person의 introduce(); 메소드 호출(메소드 오버라이딩)
		System.out.println(p5); 		//Person의 변수값(toString() 메소드) 출력
		
		p5 = new Student();				//참조 클래스 : Student
		p5.sleep();
		p5.introduce(); 				//Student의 introduce(); 메소드 호출
		System.out.println(p5); 		//Student의 변수값 출력
		
		p5 = new UniversityStudent();	//참조 클래스 : UniversityStudent
		p5.eat();
		System.out.println(p5); 		//UniversityStudent의 변수값 출력
		p5.introduce(); 				//UniversityStudent의 inttroduce(); 메소드 호출
	}

}
