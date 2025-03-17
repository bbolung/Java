package ex01;

public class Replace {

	public static void main(String[] args) {
		/*
		 * replace()메소드
		 * 문자열에서 특정 문자열을 다른 문자열로 대체
		 * String 객체의 문자열은 변경X -> 기존 문자열은 그대로 두고, 대체한 새로운 문자열을 리턴함
		 */
		
		String oldStr ="자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr =oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		if(oldStr == newStr)
			System.out.println("동일한 객체 공유");
		else
			System.out.println("다른 객체 생성");
	}

}
