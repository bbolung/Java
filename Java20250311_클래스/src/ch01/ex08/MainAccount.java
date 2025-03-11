package ch01.ex08;

public class MainAccount {

	public static void main(String[] args) {
		//Account 객체가 private이기에 getInstance() 사용
		Account acc = Account.getInstance();
		
		acc.setBalance(100);
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getInstance();
		
		acc.setBalance(100);
		System.out.println(acc.getBalance());
		
		//acc와 acc2 동일한 객체 공유
	}

}
