package ch01.ex03;

/*
 * 1. Car 객체 5개 생성
 * 2. 객체 생성시마다 아래 메시지 출력
 		1 객체 생성
 		2 객체 생성
 		3 객체 생성
 		4 객체 생성
 		5 객체 생성
 */

public class Car {
	
//	private int count;	-> 객체 개별적인 변수이기에 count가 합산되지 않고 각각 1로 출력
	static int count;	//정적 변수 : 공유자원이기에 합산되어 출력
	
	public Car() {
		System.out.println(++count);
	}
	
}
