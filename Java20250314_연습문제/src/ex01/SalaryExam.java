package ex01;

import java.util.Scanner;

/*
 * Scanner클래스를 사용해서 표준입력으로 월 정보와 등급정보를 입력받고 
각각 month변수와 grade변수에 저장한다.
 (입력받을 때는 입력받을 데이터와 관련된 적당한 메시지를 출력한다.)
 
 month:월정보 (짝수달:보너스 달,홀수달:보너스달이 아님)
 grade:등급(1-4)
 
보너스 달이면
SalaryExpr(100)를 가지고 SalaryExpr의 인스턴스를 생성하여 grade값을 전달하면서
getSalary()를 호출한 결과 값을 화면에 표준 출력한다.
(등급관계없이보너스금액은100으로설정한다.)
 
보너스 달이 아니면
SalaryExpr()를 가지고 SalaryExpr의 인스턴스를 생성하여 grade값을 전달하면서 
getSalary()를 호출한 결과를 화면에 표준 출력한다.

-출력 형식:“.....월.....등급의 월급은.....입니다.”
 */

public class SalaryExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력>>");
		int month = sc.nextInt();
		
		System.out.println("등급(1~4) 입력>>");
		int grade = sc.nextInt();
		
		int salary = 0;				//print에서 변수 사용하려면 변수선언 + 초기화 필요
		SalaryExpr expr = null;		//null : 값X
		
		if (month % 2 == 0) {
			expr = new SalaryExpr(100);
		}else {
			expr = new SalaryExpr();
			
		}
		salary = expr.getSalary(grade);
				
		System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
		
//		if (month % 2 == 0) {
//			SalaryExpr expr = new SalaryExpr(100);
//			salary = expr.getSalary(grade);
//		}else {
//			SalaryExpr expr = new SalaryExpr();
//			salary = expr.getSalary(grade);
//			
//		}
//		System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
		
//		삼항조건문으로 작성
//		int grade = sc.nextInt();
//		int salart = 0;
//		SalaryExpr expr = null;
//		
//		expr = (month % 2 == 0) ? new SalartExpr(100); new SalartExpr(0);
//		salary = expr.getSalary(grade);
//		
//		System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
	}

}
