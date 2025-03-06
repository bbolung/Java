package ch01.ex03;

public class PersonMain03 {

	public static void main(String[] args) {
		
		//이름, 나이, 전화번호만 입력
		Person person 
		= new Person("뽀룽지" , 3, "010-1234-5678'");
		
		person.나이출력();
		person.이름출력();
		person.전화번호출력();
		
		Person p2 = new Person("홍길동", 20, "010-1111-2222");
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
		
		//외부클래스(Person)에서 변수에 직접적으로 값 대입X
		//외부에서 직접 호출 : person.name = "뽀룽지";
		//이유: 변수에 이상한 값이 입력되는 것을 막기 위해서
	}

}
