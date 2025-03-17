package ex01;

public class Sunbstring {

	public static void main(String[] args) {
		/* 
		 * substring() 메소드
		 * 문자열에서 특정 위치의 문자열을 잘라내어 가져옴
		 */
		
		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0,6);	//0~5까지 추출
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}
