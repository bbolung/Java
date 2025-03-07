package ch02.ex03;

/*
 * name(이름), age(나이)를 필드로 가짐.
 * 생성자를 통해 name과 age를 설정할 수 있음.
 * introduce() 메서드를 구현하여 "안녕하세요. 제 이름은 [name]이고, [age]살입니다." 라는 문자열을 반환하도록 함.
 * main 메서드에서 Person 객체를 생성하고 introduce를 호출하여 결과를 출력할 것.
 */

public class Person {
	/*
	 * 단순 출력일 경우 여기서 바로 main 메소드 작성하여 출력가능
	   
	 	public static void main(String[] args) {
			Person p = new Person("뽀룽지", 3);
		
			String msg = p.introduce();
			System.out.println(msg);
		}
	 */
	
	
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//introduce() 메서드 구현, 문자열 반환 -> return사용
	String introduce() {
		return "안녕하세요. 제 이름은 [" + name + "]이고, [" + age + "]살입니다.";
	}
	
	/*
	 * introduce() 메소드 구현, 호출
	 * void introduce() {
	 	system.out.printf("안녕하세요. 제 이름은 [%s]이고, [%d]살입니다.\n", name, age);
	 	}
	 	-> MainPerson
	 	p.introduce();
	 */
	
	
}
