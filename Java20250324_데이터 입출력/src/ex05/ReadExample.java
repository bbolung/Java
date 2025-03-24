package ex05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		String path = "C:/Data/test2.db";
		
		try {
			InputStream is = new FileInputStream(path);
			
			byte[] data = new byte[2];
			
			while(true) {
				int num = is.read(data);
				System.out.println(num);
				
				//data == -1 : 더 이상 읽어올 데이터가 없다는 의미(파일 끝)
				if(num == -1) break;
				
				for(int i=0; i<num; i++)
					System.out.println(data[i]);
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
