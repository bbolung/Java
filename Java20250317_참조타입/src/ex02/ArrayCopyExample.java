package ex02;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		//int형 배열에 값 대입 방법
		int[] oldIntArray1 = new int[]  {10, 20, 30, 40, 50};
		
		int[] oldIntArray2 = new int[5];
		oldIntArray2[0] = 10;
		oldIntArray2[1] = 20;
		oldIntArray2[2] = 30;
		oldIntArray2[3] = 40;
		oldIntArray2[4] = 50;
		
		int[] oldIntArray = {1,2,3};
		
		System.out.println(oldIntArray.length);
		
		//oldIntArray 배열 추가 -> 확장X, 새로운 배열에 복사O
		
		int[] newIntArray = new int[6];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];		//배열복사
		}
		
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(newIntArray[i] + " ");
		
		System.out.println();
		
		//배열복사 : arraycopy()메소드 이용
		int[] intArray = new int[10];
		
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] +  " ");
		
		System.out.println();
		
		//향상된 for문
		for(int i : intArray)
			System.out.print(i + " ");
	}

}
