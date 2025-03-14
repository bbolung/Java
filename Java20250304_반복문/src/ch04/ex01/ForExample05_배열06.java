package ch04.ex01;

public class ForExample05_배열06 {

	public static void main(String[] args) {
		//2차원 for문
		//1번 for문 첫번째 실행 -> 2번 for문 조건만족할 때까지 전체 실행 -> 1번 for문 두번째 실행 ...
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* "); 	//행 "* * * * *" 출력
			}
			System.out.println();			//줄바꿈
		}
		
		System.out.println();
		System.out.println();
		
		//이중 for문
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {		//i=0이니까 j는 처음에는 1번만 "*", 두번째는 "**"...
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0; i<5; i++) {
			for(int j=0; j<5-i; j++) {		//거꾸로 버전
				System.out.print("+ ");
			}
			System.out.println();
		}
	}

}
