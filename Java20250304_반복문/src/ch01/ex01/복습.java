package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {
		//자료형 변수 = 값(초기값);
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		num = num =1;	//num =1
		num += 1; 	//num = 2
		num2 = ++num;		//전위연산자(증감): num값 증가 후 num2에 대입, num = 3, num2 = 3
		num3 = num++;		//후위연산자(증감): num값 먼저  num3에 대입 후 증가, num = 4, num3 = 3
		
		System.out.printf("%d, %d, %d\n", num, num2, num3);
		
	}

}
