package ex07;

/*
 * 익명 클래스
 */

interface Printable{
	void print();
	void print2();
}


class Papers{
	
	private String message;
	public Papers(String message) { this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		
		return new Printable() {	//return: Printable을 구현한 객체
			
			@Override
			public void print() {
				System.out.println(message);
			}
			public void print2() {
				System.out.println(message);
			}
			
		};
		
	}
}


public class AnonymousClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
		
	}
}