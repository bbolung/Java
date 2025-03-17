package ex01;

public class Ltab extends Mobile {
		public Ltab() {}
		
		public Ltab(String mobileName, int batterySize, String osType) {
			super(mobileName, batterySize, osType);
		}
		
		//사용을 통한 배터리 감소 구현
		//1분 충전시 배터리 10감소
		@Override
		public void operate(int time) {
			int size = getBatterySize();
			size -= time*10;
			setBatterySize(size);
		}
		
		//충전을 통한 배터리 증가 구현
		//1분 충전시 배터리 10증가
		@Override
		public void charge(int time) {
			int size = getBatterySize();
			size += time *10;
			setBatterySize(size);
		}
}
