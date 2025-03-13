package ex04;

public class MainPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
		
		method(u1);
		method(s1);
		method(p1);
	}
	
	static void method(Person p) {		
		//객체 타입 확인(객체 생성x)
		if(p instanceof UniversityStudent) {
			((UniversityStudent)p).sleep();
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		}else if (p instanceof Student) {
			((Student)p).sleep();
			((Student)p).study();
		}else {
			p.sleep();
		}
		System.out.println("---------------------------");
	}
}
