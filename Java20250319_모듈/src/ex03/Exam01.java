package ex03;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr = is_even(numbers);
		
//		for(int i : arr)
//			System.out.print(i + " ");
		//반복문으로 출력하지 않고, 배열에 어떤 값이 있는지 출력하고자 할 때 사용할 수 O
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(numbers));
	}
	
	static int[] is_even(int[] n) {
		int count = 0;
		
		//짝수 개수 구하기
		for(int i : n) {
			if(i % 2 == 0)
				count++;
		}
		
		int[] arr = new int[count];
		
		int index = 0;
		
		for(int i : n) {
			if(i % 2 == 0) {
				arr[index] = i;
				index ++;
			}
		}
		return arr;
	}
}
