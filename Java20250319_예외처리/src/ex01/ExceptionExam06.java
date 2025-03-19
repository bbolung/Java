package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam06 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
//		fis = new FileInputStream("file.txt");
//		-> new FileInputStream 빨간줄있는 이유
//		-> 이렇게만 작성하면 file없는 경우 에러 발생하기에 자바에서 예외 처리 강요
		
		try {
			fis = new FileInputStream("file.txt");		//파일 오픈하면 반드시 파일 닫아야 함!
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();  		//open한 파일이 없어서 닫을 파일이 없는 경우 Error발생
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료!");
	}

}
