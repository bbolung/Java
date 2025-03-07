package ch06.ex01;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car("그랜저", "검정", 350);
		
		myCar.carInfo();
		
		myCar.setSpeed(60);
		System.out.println("수정된 속도: " + myCar.getSpeed());
	}

}
