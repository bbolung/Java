package ch06.ex04;

/*
 * 요구사항
   1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐.
   2. 생성자를 통해 brand, model, year을 설정할 수 있음.
   3. startEngine() 메서드를 구현하여 "[brand] [model]의 엔진이 시작되었습니다!"를 출력하도록 함.
   4. displayInfo() 메서드를 구현하여 "자동차 정보: [year]년식 [brand] [model]"을 출력하도록 함.
   5. main 메서드에서 Car의 객체를 생성하고 startEngine()과 displayInfo()를 호출하여 실행 결과를 확인할 것. 
 */

public class Car {
	
	//필드 생성
	private String brand;
	private String model;
	private String year;
	
	Car() {
		this("기아", "K8", "2024");
	}
	
	Car(String brand) {
		this(brand, "그랜저", "2024");
	}
	
	Car(String brand, String model) {
		this(brand, model, "2024");
	}
	
	Car(String brand, String model, String year) {
		this.brand = brand;		//객체자기자신
		this.model = model;
		this.year = year;
	}
	
	//메서드 출력 -> 반환타입이 없기 때문에 void 입력
	void startEngine() {
		System.out.println("[" + brand + "] [" + model + "]의 엔진이 시작되었습니다!");
	}
	
	void displayInfo() {
		System.out.println("자동차 정보: [" + year + "]년식 [" + brand + "] [" + model +"]");
	}
	
	
}

/*
 * this 역할
	   1. 객체자기자신
	   2. 생성자 호출
 */
