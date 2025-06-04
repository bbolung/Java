package ex06;

@FunctionalInterface
interface TriFunction<T,M,R,Q>{
	public Q apply(T n1,M n2, R n3);
}

/*
 * 숫자 3개 전달하면 문자열로 합치기
 */

public class Exam08 {

	public static void main(String[] args) {
		
		TriFunction<String, String, String,String> tri = (n1, n2, n3)-> String.valueOf("" + n1 +n2+n3);
		
		String str = tri.apply("a","bb","cc");
		System.out.println(str);
	}
}









