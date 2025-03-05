package ch01.ex03;

public class BreakEx01 {

	public static void main(String[] args) {
		//1~100까지 누적하다가, sum값이 2000이상이 되는 순간 i, sum값 출력
		//sum >= 20 -> 계산할 수 있는 작은 값을 먼저 넣고 맞는지 계산 -> 맞으면 원래 조건 2000도 맞음
		
		int sum = 0;
		int i = 0;
		for(; i<=100; i++) {
			sum += i;
			if(sum >= 2000) break;
		
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
