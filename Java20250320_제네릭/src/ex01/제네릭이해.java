package ex01;

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

class appleBox {		//Apple만 담을 용도
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
	
}

class orangeBox {		//Orange만 담을 용도
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
	
}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		appleBox aBox = new appleBox();		//Apple클래스만 담는다
		orangeBox oBox = new orangeBox();	//Orange클래스만 담는다
		
		aBox.setAp(new Apple()); 	//appleBox에 Apple 참조하는 ap 담는다
		oBox.setOp(new Orange()); 	//orangeBox에 Orange 참조하는 op 담는다
//		aBox.setAp(new Orange());	-> 매개변수와 타입이 불일치하여 받을 수 없음(Apple 클래스/Apple을 상속하는 클래스만 가능)
		
		Apple ap = aBox.getAp();	//ap 꺼냄
		System.out.println(ap);
//		System.out.println(ap.toString());
		
		Orange op = oBox.getOp();	//op 꺼냄
		System.out.println(op);
	}

}
