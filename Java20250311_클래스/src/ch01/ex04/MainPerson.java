package ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산", 10);
		Person p2 = new Person("지리산", 30);
		
//		String result = p1.displayInfo();
//		System.out.println(result);
		System.out.println(p1.displayInfo());
		
		//name 변수값 변경(private 변수이기 때문에 p1.name("내장산"); -> 직접 변경X
		p1.setName("내장산");
		p1.setAge(111);
		System.out.println(p1.displayInfo());
		
		//특정변수만 반환
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
	}

}
