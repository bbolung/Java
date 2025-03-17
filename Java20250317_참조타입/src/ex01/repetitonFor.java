package ex01;

public class repetitonFor {

	public static void main(String[] args) {
		
		String[] str1 = new String[3];
		
		str1[0] = "java";
		str1[1] = "java";
		str1[2] = new String("java");
		
//		for(int i=0; i<str1.length; i++)
//			System.out.print(str1[i] + " ");
//		
		//향상된  for문
		for(String x : str1)
			System.out.print(x + " ");
	}

}
