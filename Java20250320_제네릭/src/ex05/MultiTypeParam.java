package ex05;

//여러 개의 파라미터
class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & "  + right;
	}
}

class Person {}

public class MultiTypeParam {

	public static void main(String[] args) {
		//기본타입을 객체로 사용하는 경우 boxing 해야 함 : int -> Integer
		DBox<String, Integer> iBox = new DBox<>();
		
		iBox.set("홍길동", 20);
		
		System.out.println(iBox);
		
		
//		DBox<Person, String> pBox = new DBox<Person, String>();
		DBox<Person, String> pBox = new DBox<>();	//앞에 타입 설정했기에 뒤에는 생략가능

		pBox.set(new Person(), "한국인");
		
		System.out.println();
		
		
	}

}
