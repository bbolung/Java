package ch01.ex01;

public class SmartPhone extends Phone{
	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone() {
	}
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경하였습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	void phoneInfo() {
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
	}
	
	void wifiInfo() {
		System.out.println("와이파이 상태: " + wifi);
	}
}
