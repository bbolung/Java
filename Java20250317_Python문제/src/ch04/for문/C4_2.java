package ch04.for문;

public class C4_2 {

	public static void main(String[] args) {
		int mm = 0;
		double m = 0;
		double inch = 0;
		
		System.out.println("-------------------------------");
		System.out.println("  cm     mm     m     inch");
		System.out.println("-------------------------------");
		
		for(int cm=1; cm<=100; cm++) {
			mm = (int)(cm*10.0);
			m = cm*0.01;
			inch = cm*0.3937;
			System.out.printf(" %d   %d   %.2f    %.1f");
		}
	}

}
