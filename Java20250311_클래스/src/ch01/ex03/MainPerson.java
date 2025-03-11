package ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산", 50);
		Person p2 = new Person("지리산", 30);
		
//		String result = p1.displayInfo();
//		System.out.println(result);
		System.out.println(p1.displayInfo());
		
		//생성자 오버로딩
		System.out.println();
		Person p3 = new Person();
		System.out.println(p3.displayInfo());
		
		System.out.println();
		Person p4 = new Person("치악산");
		System.out.println(p4.displayInfo());
	}

}
