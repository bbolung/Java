package ex04;

class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box {		
	private Object obj;			//Object는 모든 클래스의 상위 클래스 => 모든 클래스 받을 수O

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}


public class 제네릭이해 {

	public static void main(String[] args) {
		//Box에 Apple 클래스(사과)도 담고 Orange 클래스(오렌지)도 담으려고 함
		Box aBox = new Box();	//사과
		Box oBox = new Box();	//오렌지
		
		//String 타입이어도 Object는 모두 받기 때문에 error 발생X
		//엉뚱한 결과가 나왔지만 error 발생X -> 개발자 모를 수O => 아예 잘못된 입력을 방지할 수 있는 장치 필요(ex05)
		aBox.setObj("new Apple()");
		oBox.setObj("new Orange()");
		
//		Apple ap = (Apple)aBox.getObj();
//		Orange op = (Orange)oBox.getObj();
		
		System.out.println(aBox.getObj());
		System.out.println(oBox.getObj());
		
	}

}
