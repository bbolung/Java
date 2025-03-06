package ch01.ex02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person cat1 = new Person();
		
		cat1.name = "뽀리";
		cat1.age = 3;
		cat1.kor = 90;
		cat1.eng = 50;
		cat1.math = 30;
		
		cat1.공부하기(cat1.name);
		cat1.시험보기(cat1.kor, cat1.eng, cat1.math);
		
		Person p1 = new Person();
		int num1 = 10;
		
		p1.name = "홍길동";
		p1.age = 35;
		p1.공부하기(p1.name);
		
	}

}
