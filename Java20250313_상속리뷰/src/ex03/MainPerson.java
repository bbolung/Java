package ex03;

public class MainPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
		
		method(u1);
		method(s1);
		method(p1);
	}
	
	//객체 생성하지 않고 사용 -> static
	//method() 사용하기 위해서 매개변수로 Person P 입력 -> Person p : 참조변수의 주소값 전달받는 원본
	//P가 참고하고 있는 대상은 Person 객체이거나 Person을 상속한 객체
	static void method(Person p) {		
		//객체 타입 확인
		//p가 참고하고 있는 객체가 UniversityStudent인가?
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;
			u.sleep();
			u.study();
			u.registerCourse();
		//p가 참고하고 있는 객체가 Student인가?
		}else if (p instanceof Student) {
			Student s= (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("---------------------------");
	}
}
