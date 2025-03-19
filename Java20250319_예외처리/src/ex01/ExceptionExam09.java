package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExam09 {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = divide(10,0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
		
	}
	
	//함수 직접 처리하지 않고 던지기
	public static int divide(int num1, int num2) throws ArithmeticException {
		return num1/num2;
	}

}
