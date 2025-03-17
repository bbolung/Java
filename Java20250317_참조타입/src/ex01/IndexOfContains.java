package ex01;

public class IndexOfContains {

	public static void main(String[] args) {
		/*
		 * indexOf() 메소드
		 * 문자열에서 특정 문자열의 위치 찾을 때 사용
		 * 주어진 문자열이 시작되는 인덱스를 리턴함
		 * 만약 포함되어X -> -1 리턴
		 * 
		 * contains()
		 * 주어진 문자열이 단순히 포함되어 있는지만 확인
		 * 포함O -> true
		 * 포함X -> false
		 */
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);	//location 위치의 문자열 리턴
		System.out.println(substring);
		
		if(location != -1)
			System.out.println("프로그램과 관련된 책이군요.");
		else
			System.out.println("프로그램과 관련 없는 책이군요.");
		
		boolean result = subject.contains("자바");
		
		if(result)
			System.out.println("자바와 관련된 책이군요.");
		else
			System.out.println("자바와 관련 없는 책이군요.");
	}

}
