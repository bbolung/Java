package ch01.ex01;


public class 복습06 {

	//함수 main
	public static void main(String[] args) {
		//지역변수
		int num = 0;
		int num2 = 0;	//main 함수 안에서만 사용가능
		
		{
			int num3 = 0; 	//블럭변수 -> 블럭 안에서만 사용가능
			num++;
			num2++;
		}
//		System.out.println(num3); -> 에러발생
		num++;
	}
	
	//함수 func
	public static void func() {
		int num = 0;
	}
	
	
}
