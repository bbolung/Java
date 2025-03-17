package ex01;

public class Split {

	public static void main(String[] args) {
		/*
		 * split() 메소드
		 * 문자열이 구분자를 사용하여 여러 개의 문자열로 구성되어 있을 경우, 따로 분리해서 얻고 싶을 때 사용
		 */
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다,홍길동";
		
		//문자열 분리
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		
	}

}
