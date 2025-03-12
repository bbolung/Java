package ch01.ex01;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//생성자 : 반환타입X, 목적이 멤버변수 초기화이기 때문
	public Car() {
//		this.company = "현대";
//		this.model = "그랜저";
//		this.color = "검정";
//		this.maxSpeed = 250;
		this("현대", "그랜저", "검정", 250);
	}
	
	public Car(String company, String model) {
//		-> this.company: stack 메모리에 있는 변수, company: 생성자에 있는 변수(heap)
//		this.company = company;		
//		this.model = model;
//		this.color = "검정";
//		this.maxSpeed = 250;
		this(company, model, "검정", 250);
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getCompany() {
		return company;
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
