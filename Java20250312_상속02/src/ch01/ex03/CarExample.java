package ch01.ex03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
//		myCar.run(); 	-> 참조변수에 값X => error발생
		
		myCar.tire = new Tire();
		myCar.run();
		
		//roll()메소드 오버라이딩 -> 참조하고 있는 클래스 roll()메소드 출력
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
