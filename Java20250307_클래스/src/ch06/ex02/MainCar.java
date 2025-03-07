package ch06.ex02;

public class MainCar {

	public static void main(String[] args) {
		
		//main 메서드에서 Car의 객체 생성
		Car car1 = new Car("벤츠", "지바겐", "2025");
		
		
		//메서드 호출
		car1.startEngine();
		car1.displayInfo();
		
		
	}

}
