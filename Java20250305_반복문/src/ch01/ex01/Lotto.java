package ch01.ex01;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];
		boolean flag = false;		//중복여부 확인하기 위해 필요!
		
		for(int i=0; i<lotto.length; i++) {
			//중복 체크 과정 필요 -> 체크 후 lotto[i] 배열 대입
			int temp = (int)(Math.random()*45)+1;
			
			for(int j=0; j<lotto.length; j++) {
				if(temp == lotto[j]) {
					flag = true;
					break;	
				}
			}
			
			if(flag != true)	//중복되지 않았을 때 처리
				lotto[i] = temp;
			else {				//중복된 경우 처리
				i--;	//해당 i 위치에 값을 넣지 못했으니까 다시 실행하라는 의미 => i값 하나 감소
				flag = false;	//중복된 경우 true값으로 변경된 값을 원 상태로 복구(false) => 첫번째 if문 만족하는 경우O -> break되어 멈춰있게 됨
			}
		}
		//첫번째 if문 조건만족X -> flag 값 = false -> 두번째 if문 실행
		//첫번째 if문 조건만족O -> flag 값 = true -> else 실행
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
