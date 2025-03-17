package ex01;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	/*
	 * 추상메소드 => Mobile을 상속하는 객체는 반드시 추상메소드를 재정의해서 사용해라!
	 * 추상클래스 => 객체 생성할 수 없다.
	 */
	
	public abstract void operate(int time);
	
	public abstract void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}
	
	public String getOsType() {
		return osType;
	}
	
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	
	public int getBatterySize() {
		return batterySize;
	}
	
}
