package ch04.for문;

public class C4_1 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i= 200; i<=800; i++) {
			if(i % 5 != 0) {
				System.out.print(i + " ");
				count += 1;
				if(count % 10 == 0)
					System.out.println();
			}
		}
	}

}
