package ex05;

public class MainTV {

	public static void main(String[] args) {
		
//		SamsungTV tv = new SamsungTV();
//		
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		//SamsungTV를 LgTV로 변경할 때, 최소한으로 수정O => 상속의 장점
		//다형성(자동타입변환 + 메소드 오버라이딩)을 이용하였기에 동작하는 것.
		LgTV tv = new LgTV();
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}

}
