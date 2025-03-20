package ex05;

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

//결정되지 않은 타입<T>로 처리 -> 실제 사용할 때 구체적인 타입으로 대체
class Box<T> {		
	private T obj;			

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class 제네릭이해 {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();		//T -> Apple로 바뀐 class Box<Apple>로 변경됨
		Box<Orange> oBox = new Box<Orange>();	//T -> Orange로 바뀐 class Box<Orange>로 변경됨
		
		aBox.setObj(new Apple());		
		oBox.setObj(new Orange());		
		
		//이처럼 다른 타입 아예 넣을 수X 
//		aBox.setObj("new Apple()");		-> Apple 타입만 가능
//		oBox.setObj("new Orange()");	-> Orange 타입만 가능
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		Box<String> sBox = new Box<String>();		//String 타입 -> 문자열만 가능
		
		sBox.setObj("문자열만 입력가능");
		System.out.println(sBox.getObj());
		
		Box<Integer> iBox = new Box<Integer>();		//Integer 타입 -> 정수만 입력가능
		
		iBox.setObj(10);
		System.out.println(iBox.getObj());
	}

}
