package ex01;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExam08 {
	//일반적으로 예외 처리 경우

	public static void main(String[] args) {
		
		int result = divide(10,0);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
		
	}
	
	public static int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
