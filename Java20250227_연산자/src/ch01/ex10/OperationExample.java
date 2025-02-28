package ch01.ex10;

public class OperationExample {

	public static void main(String[] args) {

		int a = 1;
		
		//연산작업 후 결과를 다시 변수에 저장함. 계산결과 = 변수 값
		//a =a + 1
		a += 1;
		
		System.out.println(a);		//a = 2
		
		a++;
		++a;
		System.out.println(a);		//a = 4
		
		a *= 3;
		System.out.println(a);		//a = 12
		
		a -= 10;
		System.out.println(a);		//a = 2
		
		
	}

}
