package ex01;

public class Length {

	public static void main(String[] args) {
		/*
		 * length() 메소드
		 * 문자열에서 문자의 개수(공백 포함)
		 */
		String ssn = "9506241230123";
		
		int length = ssn.length();
		
		if(length == 13)
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		else
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		
	}

}
