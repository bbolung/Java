package book;

public class Television {
	//정적 필드 : 필드 선언과 동시에 초기값 주는 것이 일반적
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	//초기화 작업 필요한 경우 정적 블록 이용 -> 초기값 주기
	static {
		info = company + "-" + model;
	}
}
