package ch06.ex07;

public class KoreanExample {

	public static void main(String[] args) {
		//Korean 객체 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		
		//Korean 객체 데이터 읽기
		k1.displayInfo();
		System.out.println();
		
		//또 다른 Korean 객체 생성
		Korean k2 = new Korean("김자바", "930525-0654321");
		
		//또 다른 Korean 객체 데이터 읽기
		k2.displayInfo();
	}

}
