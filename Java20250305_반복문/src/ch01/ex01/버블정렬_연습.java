package ch01.ex01;

public class 버블정렬_연습 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int tmp;
		int temp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다.
		for(int i=0; i<numArr.length; i++) { 
			tmp =(int)(Math.random()*100)+1;
			numArr[i] = tmp;
		}
		//회전반복용도
		for(int i=0; i<numArr.length; i++) {
			//두개의 값 비교용도
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

}
