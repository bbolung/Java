package ex01;

public class GuGuDanExpr extends Multiplication {
	
	public GuGuDanExpr() {}
	public GuGuDanExpr(int dan) {
		super(dan);
	}
	public GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}

	public static void printAll() {
		for(int i=1; i<=9; i++) {
			System.out.print(i + "단 : ");
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + i*j +"\t");
			}
			System.out.println();
		}	
	}

	
}
