package ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Person{}

public class WriteExample {
	
	public static void main(String[] args) {
		//입력한 경로에 해당 파일 없으면 파일 생성됨(test3.db)
		String path = "c:/Data/test2.db";
		
		OutputStream os = null;
		
		try {
			//path에 갔는데 파일 없는 경우 -> 예외처리(FileNotFoundException)
			os = new FileOutputStream(path);
			
			//배열 한 번에 보냄
			byte[] arr = {10,20,30};
			
			//os에 저장하다가 문제 발생할 경우 -> 예외처리(IOExcaption)
			os.write(arr);
			
			os.flush();
			
			os.close();		//경로 닫음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
