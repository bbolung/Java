package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Person{}

public class WriteExample {
	/*
	 * new Person(); 작성 후 Person 위에서 단축키 ctrl+2,L 누르면 앞에 자동완성
		   Person person = new Person();
			String msg = "String";
			int num = 10;
	 */

	public static void main(String[] args) {
		//입력한 경로에 해당 파일 없으면 파일 생성됨(test1.db)
		String path = "c:/Data/test1.db";
		
		OutputStream os = null;
		
		try {
			//path에 갔는데 파일 없는 경우 -> 예외처리(FileNotFoundException)
			os = new FileOutputStream(path);
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//os에 저장하다가 문제 발생할 경우 -> 예외처리(IOExcaption)
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			
			os.close();		//경로 닫음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
