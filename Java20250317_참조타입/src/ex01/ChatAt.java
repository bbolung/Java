package ex01;

public class ChatAt {

	public static void main(String[] args) {
		/*
		 * charAt() 메소드
		 * 문자열에서 특정 위치의 문자 얻고 싶을 때 사용
		 * 매개값에서 주어진 인덱스(0~문자열의 길이-1)의 문자를 리턴
		 */
		
		String ssn = "9506241230123";
		
		char sex = ssn.charAt(6);
		
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
	}

}
