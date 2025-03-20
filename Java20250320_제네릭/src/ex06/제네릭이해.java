package ex06;

/*
 * T : 타입인자 -> 타입에 제한O
 * T extends A : T에게 전달되는 대상은 A이거나 A의 하위 클래스만 전달 가능
 */

class Box<T extends A> {		
	private T obj;			

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class A{}
class B extends A {}
class C extends B {}

class D {}
class Person {}
class Car {}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		
		//불가능한 타입
//		Box<D> dBox = new Box<>();
//		Box<Person> personBox = new Box<>();
//		Box<Car> carBox = new Box<>();
		
		
	}

}
