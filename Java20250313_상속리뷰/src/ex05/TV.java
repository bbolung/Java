package ex05;

/*
 * 클래스 내부에 추상클래스가 1개 이상 존재하면 그 클래스 = 추상클래스 (클래스명에 abstract 입력해야 O)
 */

public abstract class TV {
	
	boolean power;
	int volume;
	
	TV() {
		power = false;
		volume = 0;
	}
	
	//추상메소드 abstract -> 중괄호{} 없음 -> 메소드가 미완성인 상태 => 추상클래스 = 미완성 클래스
	//미완성 클래스이기에 TV클래스를 참조하여 객체생성X
	//LgTV tv = new TV(); -> 객체생성 불가(우측 위치X)
	//Tv tv = new SamsungTV(); -> 참조는 가능(좌측 위치O)
	//추상클래스는 틀만 제공!
	//TV클래스를 상속하는 클래스는 반드시 추상메소드를 재정의한 후 사용해야 함 -> 강제화
	abstract void powerOn();
	
	abstract void powerOff();
	
	abstract void volumeUp();
	
	abstract void volumeDown();
	
	//추상클래스 내에 일반 메소드 존재O -> 상속받는 클래스에서 재정의 유무 선택할 수O
	void test() {}
}
