package ex01;

public class Otab extends Mobile {
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	//사용을 통한 배터리 감소 구현
	//1분 충전시 배터리 12감소
	@Override
	public void operate(int time) {
		int size = getBatterySize();
		size -= time*12;
		setBatterySize(size);
	}
	
	//충전을 통한 배터리 증가 구현
	//1분 충전시 배터리 8증가
	@Override
	public void charge(int time) {
		int size = getBatterySize();
		size += time *8;
		setBatterySize(size);
	}
}
