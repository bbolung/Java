package ex03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Person{}

public class WriteExample {
	
	public static void main(String[] args) {
		//입력한 경로에 해당 파일 없으면 파일 생성됨(test3.db)
		String path = "c:/Data/test3.db";
		
		OutputStream os = null;
		
		try {
			//path에 갔는데 파일 없는 경우 -> 예외처리(FileNotFoundException)
			os = new FileOutputStream(path);
			
			//배열 한 번에 보냄
			byte[] arr = {10,20,30,40,50};
			
			//배열에서 1번째~3번째까지만 보냄 -> 20,30,40
			os.write(arr,1,3);
			
			os.flush();
			
			os.close();		//경로 닫음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
