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
		
		
	}

}
