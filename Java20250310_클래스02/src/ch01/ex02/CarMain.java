package ch01.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {

		// 정적 메소드 : 객체 생성하지 않고
		// 클래스명.정적메소드명; -> 실행 가능
		// 클래스명.정적변수명; -> 실행 가능
		
		Car.runState();
		System.out.println(Car.companyState);

		
		Car car1 = new Car(); 
		car1.displayInfo(); 
		System.out.println();
		  
		Car car2 = new Car("기아", "K8", "흰색", 200); 
		car2.displayInfo();
		car2.runState(); 	//가능하지만 인스턴스 메소드인지 정적 메소드인지 구별X
		Car.runState(); 	//이렇게  작성하면 정적 메소드인지 구별O
		System.out.println();
		 

		Random random = new Random();
		int num1 = (int)(random.nextInt()*45)+1; //nextInt() : 인스턴스 메소드이기에 객체 생성O
		
		int num2 = (int)(Math.random()*45)+1;	//random() : 정적메소드이기에 객체 생성X
		
	}

}
