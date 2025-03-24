package ex08;

//import java.io.*; : 입출력 패키지 사용!
import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:/Data/new.txt"));
		
		int lineNo = 1;
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close();
	}

}
