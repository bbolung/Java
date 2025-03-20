package ex04;

public class MathExample {

	public static void main(String[] args) {
		//세 개의 변수 중 가장 큰 값 구하기(if문 사용해도 되지만 코드 길어지니까)
		
		int i = 10;
		int j = 5;
		int k = 20;
		
		int max = Math.max(Math.max(i, j), k);
		
		System.out.println(max);
		
	}

}
