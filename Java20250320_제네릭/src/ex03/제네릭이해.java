package ex03;

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
		
		//실수로 인한 error 발생
		aBox.setObj("new Apple()");
		oBox.setObj("new Orange()");
		
		Apple ap = (Apple)aBox.getObj();	//String타입이기에 Apple타입으로 반환X -> error발생
		Orange op = (Orange)oBox.getObj();
		System.out.println(ap);
		System.out.println(op);
		
	}

}
