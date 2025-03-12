package ch01.ex02;

public class Car {
	//인스턴스 변수 : 객체가 생성되어야 메모리에 올라감
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	private static int count;
	
	//정적 변수 : 객체가 생성되기 전에 메모리에 올라감
	static String companyState = "GM";
	
	//정적 메소드
	static void stateFunc() {
	}
	
	public static void runState() {
		//정적 메소드 안에서 사용할 수 있는 변수 및 메소드는 static이 붙어있는 정적 메소드, 정적 병수만 가능
		System.out.println("Static Run");
		count++;
		companyState = "기아";
		stateFunc();
//		인스턴스 메소드, 변수는 객체가 생성되어야 메모리에 저장되기에 정적 메소드에 사용X
//		company = "현대";		
//		run();				
	}
	
	public Car() {
		//다른 생성자 호출하는 this(), super() =>항상 함수 맨 앞에 와야 함
		this("현대", "그랜저", "검정", 250);
		System.out.println("count");
//		this("현대", "그랜저", "검정", 250);	//뒤에 오면 에러발생
	}
	
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
}
