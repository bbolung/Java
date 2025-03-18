package emp;

public class Secretary extends Employee implements Bonus {
	
	public Secretary() {}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		double tax = getSalary()*0.1; 		//salary에 10% 징수
		return tax;
	}
	
	@Override
	public void incentive(int pay) {
		//salary에 계산된 인센티브를 가산한다. 인센티브는 pay의 80%이다.
		//private 변수 salary 값 가져오기 위해서 getter 이용
		//salary값 변경하기 위해 setter 이용
		int salary = getSalary();
		salary += pay*0.8;
		setSalary(salary);
	}

}
