package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr = is_even(numbers);
		
		for(int i : arr)
			System.out.print(i + " ");
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
