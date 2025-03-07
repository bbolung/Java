package ch02.ex04;

public class BankAccount_ {
	
	private String owner;
	private double balance;
	
	public BankAccount_(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}

/*
 * 수정 요구사항
   1. withdraw() 메서드를 개선하여 잔액보다 많은 금액을 출금할 경우 "잔액 부족"을 출력하고 출금을 방지할 것.
   2. getBalance() 메서드를 추가하여 현재 잔액을 반환할 것.
   3. main 메서드에서 BankAccount 객체를 생성하고 입금, 출급을 테스트할 것.
 */

