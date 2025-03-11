package ch01.ex07;

public class Account {
		private int balance;
		
		private final static int MIN_BALANCE = 0;
		private final static int MAX_BALANCE = 1000000;
		
		public Account() {
		}
		
		void setBalance(int balance) {
//			if(MIN_BALANCE <= balance <= MAX_BALANCE)	-> X
//			if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) -> X (가능하지만 이렇게 작성X)
			if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {	//항상 변수가 좌측에 오게 작성
				this.balance = balance;
			}
		}
		
		int getBalance() {
			return balance;
		}
		
}
