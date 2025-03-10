package ch01.ex03;

public class CarMain02 {
	//여기는 다 가족
	int speed;
	
	void run() {
		speed = 100;
	}
	
	
	public static void main(String[] args) {
		CarMain02 car = new CarMain02();
		
//		speed = 200; 	-> main() 메소드는 손님이기에 반드시 객체 생성 후 인스턴스 변수, 메소드 사용
		car.speed = 200;
		System.out.println("main()");
	}

}

//public class는 단 하나만 O, public class 안에 main() 메소드 입력
//public class 없는 경우, 파일명과 동일한 class 안에 main() 메소드 입력
//이렇게 하지 않을 경우 에러 발생
class Car02{
	
}