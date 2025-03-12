package ch06.ex04;

import ch06.ex04.Car;

public class MainCar {

	public static void main(String[] args) {
		//this 설명
		
		Car car1 = new Car();
		car1.displayInfo();
		
		Car car2 = new Car("벤츠");
		car2.displayInfo();
		
		Car car3 = new Car("벤츠", "지바겐");
		car3.displayInfo();
		
	}

}
