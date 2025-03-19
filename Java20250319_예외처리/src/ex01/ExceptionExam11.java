package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExam11 {

	public static void main(String[] args) throws ArithmeticException {
		int result = 0;
		
		result = divide(10,0);
			
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
		
	}
	
	//함수 직접 처리하지 않고 던지기
	public static int divide(int num1, int num2) throws ArithmeticException {
		if(num2 == 0) 
			throw new ArithmeticException("0으로 나눌 수는 없습니다.");
		
		return num1/num2;
	}

}
