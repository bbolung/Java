package ch02.ex04;

public class MainBankAccount {

	public static void main(String[] args) {
		
		//main 메서드에서 BankAccount 객체 생성
		BankAccount b1 = new BankAccount("뽀룽지", 10000);
		
		b1.deposit(10000);
		b1.withdraw(100000);	//잔액부족 - > 처리안됨
		b1.withdraw(2000);
		
		System.out.println(b1.getBalance());
		System.out.println(b1.getDeposit());
	}

}
