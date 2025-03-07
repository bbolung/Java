package ch02.ex04;

public class BankAccount {
	
	//잔액보다 많은 금액 출금하려는 것처럼 변수에 말도 안되는 값 대입을 막기 위해서 private 사용
	private String owner;
	private double balance;
	
	public BankAccount() {}		//default 생성자 생성(인자값이 없는 생성자)
	
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//반환 메소드
	double getBalance() {
		return balance;
	}
	
	//반환 메소드
	double getDeposit() {
		return balance;
	}
	
	
	//생성자
	public void deposit(double amount) {
		balance += amount;
	}
	
	//생성자
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("잔액 부족");
		}else {
			balance -= amount;
		}
	}
}

/*
 * 수정 요구사항
   1. withdraw() 메서드를 개선하여 잔액보다 많은 금액을 출금할 경우 "잔액 부족"을 출력하고 출금을 방지할 것.
   2. getBalance() 메서드를 추가하여 현재 잔액을 반환할 것.
   3. main 메서드에서 BankAccount 객체를 생성하고 입금, 출급을 테스트할 것.
 */

