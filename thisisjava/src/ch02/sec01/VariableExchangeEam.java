package ch02.sec01;

public class VariableExchangeEam {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println("before : ");
		System.out.println("a = " + a + ", " + "b = " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("after : ");
		System.out.println("a = " + a + ", " + "b = " + b);
		
		
		//double > float > long > int > short > byte
		//float(4byte) > long(8byte)
		//실수는 무한대이기에 float이 더 큼
		//실수 = double이 기본이기에 float에 실수 대입할 경우 -> f추가
		//long, short, byte 값을 float에 대입할 때는 f 없
		float f1 = 10.0f;
		long li = 1000;
		f1 = li;
		
		System.out.println("f1 = " + f1);
		
	}

}
