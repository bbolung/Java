package ch06.ex01;

public class Car {
	
	//필드생성
	private String company = "현대자동차";	
	private String model;		
	private String color;
	private int maxSpeed;
	private int speed;
	
	//default 생성자
	public Car() {
	}

	//생성자
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메서드 출력
	void carInfo() {
		System.out.println("제작회사: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색깔: " + color);
		System.out.println("최고속도: " + maxSpeed);
		System.out.println("현재속도: " + speed);
	}
	
	//speed 값 변경
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//speed 값 외부에서 출력
	int getSpeed() {
		return speed;
	}
	
	
	
}
