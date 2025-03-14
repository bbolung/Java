package ex01;

public class SalaryExpr {
	private int bonus;
	
	SalaryExpr() {
		bonus = 0;
	}
	
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	
	
	int getSalary(int grade) {
		//if문도 가능
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
		}
		
		return bonus;
	}
}
