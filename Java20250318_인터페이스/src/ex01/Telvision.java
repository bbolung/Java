package ex01;

/*
 * interface의 객체 생성X -> 상속 받아야 사용O
 * interface 구현(상속) : class 클래스명 implements 인터페이스 클래스명
 * 추상클래스처럼 interface도 틀만 제공함!
 */

public class Telvision implements RemoteControl {
	//추상메소드 모두 구현O -> 안그러면 에러발생
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public
	void turnOff() {}
	
	@Override
	public void setVolume(int volume) {} 
	
	
}
