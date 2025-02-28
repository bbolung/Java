package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {

		// String : 문자열(") 변수에 저장
		String name1 =	"나는 자바를 배웁니다.";
		String name2 =	"나는 \"자바\"를 배웁니다.";
		String name3 =	"나는 \t자바를 배웁니다.";
		String name4 =	"나는\n자바를\n배웁니다.";
		String name5 =	"나는 \r자바를 배웁니다.";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		
		System.out.print("-----");
		System.out.println("*****");
		System.out.print("+++++");
		System.out.println("*****");
		
	}

}
