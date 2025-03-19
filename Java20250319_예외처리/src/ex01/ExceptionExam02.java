package ex01;

public class ExceptionExam02 {

	public static void main(String[] args) {
		
		//int num = 10/0;	-> ArithmeticException : 어떤 수를 0으로 나누게 되면 발생하는 에러
		
		int[] arr = new int[5];		//0~4
		
		arr[4] = 100;
		
		//arr[5] = 10;	-> ArrayIndexOutOfBoundsException
		
		String str = null;
		
		//System.out.println(str.length());		-> NullPointerException
		
		//NullPointerException 해결방법
		if(str != null)
			System.out.println(str.length());
		
		String str2 = "korea";
		
		if(str2 != null)
			System.out.println(str2.length());
	}

}
