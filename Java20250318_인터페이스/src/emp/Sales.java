package emp;

public class Sales extends Employee implements Bonus {
	
	public Sales() {}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		double tax = getSalary()*0.13;		//salary에 13% 징수
		return tax;
	}
	
	@Override
	public void incentive(int pay) {
		//salary에 계산된 인센티브를 가산한다. 인센티브는 pay의 120%이다.
		//private 변수 salary 값 가져오기 위해서 getter 이용
		//salary값 변경하기 위해 setter 이용
		int salary = getSalary();
		salary += pay*1.2;
		setSalary(salary);	
	}
	
	public double getExtraPay() {
		//영업직원에게만 제공되는 추가수당을 리턴한다. salary의 3%금액 리턴 
		return getSalary()*0.03;
	}

	

}
