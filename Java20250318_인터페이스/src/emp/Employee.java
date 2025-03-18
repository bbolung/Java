package emp;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department; 		//부서
	private int salary;				//월급
	
	public Employee() {}
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	int getSalary() {
		return salary;
	}
	
	String getName() {
		return name;
	}
	
	String getDepartment() {
		return department;
	}
	
	public abstract double tax();
}
