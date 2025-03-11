package ch01.ex08;

/*
 * 싱글통 패턴 
 */

public class Account {
		
		private int balance;
		
		private final static int MIN_BALANCE = 0;
		private final static int MAX_BALANCE = 1000000;
		
		//싱글톤 패턴이기에 외부에서 객체 생성X => private
		//정적 메소드 getInstance에 사용하려면 static 붙여줌
		private static Account ac = new Account();
		
		//외부 접근X -> private
		private Account() {
		}
		
		//참조변수 ac의 타입 = Account
		//반환값 ac의 타입 = Account -> Account ac
		//정적메소드 : 정적요소만 사용가능
		static Account getInstance() {
			return ac;
		}
		
		void setBalance(int balance) {
			if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {	//항상 변수가 좌측에 오게 작성
				this.balance = balance;
			}
		}
		
		//반환값 balance의 타입 = int -> int getBalance
		int getBalance() {
			return balance;
		}
		
}
