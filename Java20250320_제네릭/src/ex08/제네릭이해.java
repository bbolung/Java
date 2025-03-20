package ex08;

/*
 * 제네릭 메소드 :  하나의 메소드로 다양한 타입을 처리O
 */

class Box<T> {		
	private T obj;			

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class BoxFactory {
	/*
	 * <T> : 제네릭 메소드 표시
	 * Box<T> : 반환타입
	 * T o : T타입의 매개변수
	 */
	public static <T> Box<T> makeBox(T o) { 
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭이해 {

	public static void main(String[] args) {
		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj());
		
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj());
	}
	

}
