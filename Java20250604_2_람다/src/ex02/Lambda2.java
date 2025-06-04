package ex02;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

/*
class Printer implements Printable{

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}	
}
*/

public class Lambda2 {

	public static void main(String[] args) {

		Printable p = new Printable() {  //익명클래스, 구현 class 선언하지 않고 직접 사용
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		
		p.print("이 문장 출력 요망2!!");
	}

}