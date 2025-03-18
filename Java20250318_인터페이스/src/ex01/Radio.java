package ex01;

public class Radio implements RemoteControl {
	//추상메소드 모두 구현O -> 안그러면 에러발생
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다.");
	}
	
	@Override
	public void turnOff() {}
	
	@Override
	public void setVolume(int volume) {} 
	
}
