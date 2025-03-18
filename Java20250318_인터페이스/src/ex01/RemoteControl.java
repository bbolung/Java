package ex01;

public interface RemoteControl {
	//일반 메소드X
//	void trunOn() {} -> 입력 불가
	//추상 메소드
	public void turnOn();	 //중괄호 없으면 가능
	
	//필드 : 모두 public static final이 기본! - > 생략 가능
	//외부에서 필드 사용하고자 할 때, (인터페이스명.MAX_VOLUME) 이렇게 사용해랴 함
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/*
	 * interface 상수
	 * 멤버변수 생성 불가
	 * 정적변수만 생성 가능ㅠ
	 */
	
	//추가 추상 메소드 -> 무조건 구현해서 재정의해야 함
	void turnOff();
	void setVolume(int volume);
	
	//차후에 새로운 메소드 추가 -> 인터페이스 하는 클래스 오류 발생(구현하지X)
	//해결법 : 디폴트 메소드 사용 -> 이 메소드는 재정의 유무 선택할 수 O
	//처음에는 추상 메소드만 입력, 차후에 업그레이드할 때 다른 클래스 고치지 않아도 되는 디폴트 메소드 사용
	//default 메소드()
	default void newfunc() {
		
	}
	
}
