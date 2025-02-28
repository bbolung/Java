package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// double > float  > long > int > short > byte
		
		double d1 = 10.2;
		int i1 = 10;
		// 파일이 다르면 연산 등의 작업 불가능하기에 파일 일치시킴
		// d1 = (double)i1; 이렇게 적어야 하는데, 생략해도 자동변화됨
		d1 = i1; 
		
		short s1 = 10;
		i1 = s1;
		
		/*
		 * s1 = i1 : short가 크기가 더 작아서 불가능
		 * s1에 i1의 값이 작아서 가능하다면 임의로 변환할 수도 있음, 클 경우 불가능
		 */
		s1= (short)i1;
		
		
	}

}
