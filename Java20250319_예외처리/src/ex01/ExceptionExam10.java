package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExam10 {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = divide(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
		
	}
	
	//함수 직접 처리하지 않고 던지기
	public static int divide(int num1, int num2) throws ArithmeticException {
		//num2 == 0일 경우 아래 실행문 던져서 실행(나만의 메시지 출력)
		if(num2 == 0) 
			throw new ArithmeticException("0으로 나눌 수는 없습니다.");
		
		return num1/num2;
	}

}
