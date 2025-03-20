package ex04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍, 박연수-박수홍";
		
		String[] arr = data1.split("&|, |-");
		
		for(String token : arr)
			System.out.println(token);
		
		System.out.println(Arrays.toString(arr));	//배열 한번에 출력
		
		System.out.println();
		
		String data2 = "홍길동/이수홍,박연수-박수홍";
		
		StringTokenizer st = new StringTokenizer(data2, "/,-");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
