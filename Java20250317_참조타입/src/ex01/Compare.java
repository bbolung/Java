package ex01;

/*
 * 참조 타입 변수의 값 비교(==, !=)
 * 참조 타입 변수의 값 = 객체의 번지
 * ==, != : 번지를 비교하는 것
 * 번지 같은 경우 -> 동일한 객체 참조
 * 번지 다를 경우 -> 다른 객체 참조
 */

public class Compare {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; 	//배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3};		//배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
		arr3 = arr2;					// 배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		//arr1과 arr2 변수가 같은 배열을 참조하는지? -> 저장 항목은 같지만 서로 다른 객체 생성 => 다른 번지
		System.out.println(arr1 == arr2);	
		//arr2와 arr3 변수가 같은 배열을 참조하는지? -> arr3 : arr2 변수의 번지가 대입 => 동일한 번지
		System.out.println(arr2 == arr3);	
	}

}
