package ch02.sec09;

public class VariableScopeExample {

	public static void main(String[] args) {

		int num = 10;
		
		{
			int n1 = 20;
			num = num +1;
			System.out.println(num); //11
			
			System.out.println(n1); //20
		}
		
		System.out.println(num); //11
		// System.out.println(n1); 해당 블록 외 -> 에러 발생
		
	}

}
