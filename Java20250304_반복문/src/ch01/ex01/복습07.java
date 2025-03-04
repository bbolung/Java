package ch01.ex01;


public class 복습07 {

	//함수 main
	public static void main(String[] args) {
		int sum = 0;
		
		//int i = 1;
		//int i;
		for(int i=1; i<=5; i++) {	//i는 for문 벗어나면 소멸되는 변수
			sum += i;
		}
	
		System.out.println(sum);
	}
	
	
}
