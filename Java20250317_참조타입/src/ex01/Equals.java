package ex01;

/*
 *문자열 비교
 *문자열 리터럴이 동일 -> String 객체 공유
 *
 * new 연산자 : 새로운 객체를 만드는 연산자, 객체 생성 연산자
 * new 연산자 사용 -> 동일한 리터럴 대입이어도 다른 객체 생성
 * 
 * 객체 비교 : ==, !=
 * 내부 문자열만 비교 : .equals(), ! .equals()
 */

public class Equals {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) 
			System.out.println("str1과 str2는 참조가 같음");
		else
			System.out.println("str과 str2는 참조가 다름");
		
		if(str1.equals(str2))
			System.out.println("str1과 str2는 문자열이 같음");
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str3 == str4) 
			System.out.println("str3과 str4는 참조가 같음");
		else
			System.out.println("str3과 str4는 참조가 다름");
		
		if(str3.equals(str4))
			System.out.println("str3과 str4는 문자열이 같음");
		
		//String 변수에 빈 문자열("") 대입 O
		//빈 문자열("")도 String 객체로 생성 -> 변수가 빈 문자열을 참조하는지 확인 -> .equals() 메소드 사용
		String hobby = "";
		if(hobby.equals(""))
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
	}

}
