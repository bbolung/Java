package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam07 {

	public static void main(String[] args) {
		
		//ExcrptionExam06을 다르게 표현
		//파일 닫는 실행문 없어도 자동으로 닫음(닫지 않는 것 방지하기 위해)
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//IOException 쓰기 귀찮거나 어떤건지 모르겠으면 Exception 넣어도 됨
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료!");
	}

}
