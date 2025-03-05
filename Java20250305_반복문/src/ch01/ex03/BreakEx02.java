package ch01.ex03;

public class BreakEx02 {

	public static void main(String[] args) {
		//이중 for문 break -> 하나의 for문만 벗어남
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
				
				//j 포함된 for문만 벗어남 -> 줄바꿈 후 다시 i 포함된 for문 실행 -> j 포함된 for문 실행...
				if(i == j) break;	
			}
			System.out.println();
		}
	
	}

}
