package ex09;

class Box<T> {		
	private T obj;			

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return (String)obj;
	}
}

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
	
	//								상향 제한 --> 목적: 읽기전용, 쓰기X
	public static void peekBox1(Box<? extends B > box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj(box); -> 읽기 전용이기에 Error 발생
	}
	
	//								하향 제한 --> 목적: 쓰기전용, 읽기O
	public static void peekBox2(Box<? super B > box) {
//		System.out.println(box);
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {
		Box<D> box = new Box<>();
//		box.setObj(new D());
		
		Unboxer.peekBox1(box);
		
		//상향 제한 -> A클래스 X => Error 발생
//		Box<A> box = new Box<>();
		
//		Unboxer.peekBox1(box);
		
		//하향 제한 -> C클래스 X => Error 발생
//		Box<C> box = new Box<>();
		
//		Unboxer.peekBox2(box);
		
		
	}

}
