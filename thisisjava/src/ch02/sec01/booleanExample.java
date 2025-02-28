package ch02.sec01;

public class booleanExample {

	public static void main(String[] args) {

		// boolean stop = true or false만 대입O
		boolean stop = true; 
		
		/*
		 * > : 크다
		 * >= : 크거나 같다
		 * < : 작다
		 * <= : 작거나 같다
		 * == : 같다
		 * != : 같지 않다
		 * ! : 부정
		 * && : 그리고, and
		 * || : 또는. or
		 */
		
		boolean check1 = 5 != 5;
		System.out.println(check1);
		
		boolean check2 = !true;
		System.out.println(check2);
		
		boolean check3 = (5>2) && (5>11);
		System.out.println(check3);
		
		boolean check4 = (5>2) || (5>11);
		System.out.println(check4);
	}

}
