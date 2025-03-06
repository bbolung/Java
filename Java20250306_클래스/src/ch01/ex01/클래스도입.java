package ch01.ex01;

/*
 * 이름, 전화번호, 나이, 국어, 영어, 수학 -> 입력받음(정적 -> 변수)
 * 공부하기, 시험보기, 등교하기 -> 입력받음(동적 -> 함수)
 */

public class 클래스도입 {

	public static void main(String[] args) {
		
		String name = "뽀리";
		String phone = "010-1234-5678";
		int age, kor, eng, math;
		age = 3;
		kor = 90;
		eng = 80;
		math = 70;
		
		//함수는 호출하지 않으면 동작하지 않음 => 따라서 아래와 같은 함수호출 필요!
		공부하기(name);
		시험보기(kor, eng, math);
		등교하기(name);
		
		System.out.println("-------------------------------");
		
		String name2 = "누룽지";
		String phone2 = "010-1234-5678";
		int age2, kor2, eng2, math2;
		age2 = 3;
		kor2 = 80;
		eng2 = 70;
		math2 = 60;
		
		공부하기(name2);
		시험보기(kor2, eng2, math2);
		등교하기(name2);
	}
	
	public static void 공부하기(String name) {
		System.out.println(name + " 공부하기");
	}
	
	public static void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		System.out.println("세 과목의 합: " + sum);
	}
	
	public static void 등교하기(String name) {
		System.out.println(name + " 등교하기");
	}

}
