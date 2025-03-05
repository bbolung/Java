package ch01.ex01;

public class Lotto02 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//배열섞기
		
		for(int i=0; i<500; i++) {		//i<500 : 500번 섞음
			int index = (int)(Math.random()*45);  //1~44사이의 난수
			
			int temp = lotto[0];	//0만 계속 바뀌어도 500번 섞는거니까 다 섞이는 것?
			lotto[0] = lotto[index];	//index가 바뀌니까 섞임
			lotto[index] = temp;
		}
		//배열 45개 칸 중 앞자리 6자리만 출력
		System.out.println("이번 주 예상 로또 번호: ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
