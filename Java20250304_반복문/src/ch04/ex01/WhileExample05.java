package ch04.ex01;

public class WhileExample05 {

	public static void main(String[] args) {
		
		/*
		 * 조건식 없는 상태로 실행 -> 조건이 없으니까 항상 참 => 무한반복
		 * for(; ; ) {
			System.out.println("for문");
			}
			
		 * int cnt=0;
		
			while(true) {
				System.out.println(cnt);
			}
		 */
		
		int count=0;
		for(; ; count++) {
			if(count>100) break;
			
			System.out.println(count);
		}
		System.out.println(); 		//줄바꿈
		
		int cnt=0;
		
		while(true) {				//이런 경우는 for문보다 while문이 더 일반적으로 많이 쓰임.
			cnt++;
			if(cnt>100) break;
			System.out.println(cnt);
		}
		
	}

}
