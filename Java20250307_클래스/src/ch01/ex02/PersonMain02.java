package ch01.ex02;

public class PersonMain02 {

	public static void main(String[] args) {
		
		//이름, 나이, 전화번호만 입력
		Person p1 = new Person();
		p1.name = "뽀룽지";
		p1.age = 3;
		p1.phone = "010-1234-5678";
		
		//메소드 호출해서 출력
		p1.이름출력(p1.name);
		p1.나이출력(p1.age);
		p1.전화번호출력(p1.phone);
		
	}

}
