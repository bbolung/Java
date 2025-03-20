package ex07;

/*
 * class Number : 정수, 실수 가능한 클래스(document 참고)
 */

class Box<T extends Number> {		
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
		Box<Integer> ibox = new Box<>();
		ibox.setObj(10);
		
		Box<Double> dbox = new Box<>();
		dbox.setObj(10.2);
		
//		Box<String> sbox = new Box<>();		-> String은 불가
	}

}
