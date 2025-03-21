package ch04.ex01;

public class WhileExample04 {

	public static void main(String[] args) {
		/*
		 * 구구단 출력
		
			for(int i=2; i<=9; i++) {
				System.out.printf("****%d단****\n", i);
				for(int j=1; j<=9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i*j);
				}
				System.out.println();
		 */
		
		int i=2;
		
		while(i<=9) {
			//j가 들어가는 while문 밖에 꼭 int j=1; 있어야 함. 적어도 j=1; 이라도 있어야 구구단 출력
			//없으면 i=2일 때, j=10까지 한번 반복 후 계속 j=10이기에 j가 들어간 while문 실행X
			int j=1;		
			System.out.printf("****%d단****\n", i);
			while(j<=9) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				j++;
			}
			System.out.println();
			//j=1;  => 여기에 위치해도 가능
			i++;
		}
		
	}

}
