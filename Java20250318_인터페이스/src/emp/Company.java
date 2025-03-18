package emp;

public class Company {

	public static void main(String[] args) {
		//Employee 배열에 객체들을 생성하여 저장한다.
		
		/*
		Employee[] employees = new Employee[5];
		employees[0] = new Secretary("Duke", 1, "secretary", 800);
		employees[1] = new Sales("Tuxi", 2, "sales", 1200);
		*/
		
		/*
		 * Employee[] employees = new Employee[5];는 Employee 배열을 생성하는 코드
		 * 배열에 Employee의 서브클래스 인스턴스를 할당할 수 있습니다.
		 * Employee 자체는 추상 클래스이기 때문에, 배열의 요소로는 Employee 클래스가 아닌 그 하위 클래스의 인스턴스를 넣어야 합니다.
		 */
		
		Employee[] employees = {
				new Secretary("Duke", 1, "secretary", 800),
				new Sales("Tuxi", 2, "sales", 1200)
		};
		
		//printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다. 
		//이 때는 세금을 출력하지 않는다.
		System.out.println("name\tdepartment\tsalary\textrapary");
		System.out.println("---------------------------------------------------------------------");
		Company.printEmployee(employees, false);
		
		//모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.)  
		for(Employee emp : employees) {
			if(emp instanceof Bonus) {		//emp가  참조대상이 Bonus을 구현한 객체인가?(구현한 객체를 가진 경우 강제타입변환O)
				Bonus bonus = (Bonus)emp;
				bonus.incentive(100);
//				((Bonus) emp).incentive(100);
			}
		}
		System.out.println();
		System.out.println();
        //printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보와 세금을 출력한다
		System.out.println("[인센티브 100 지급]");
		System.out.println("name\tdepartment\tsalary\ttax\textrapary");
		System.out.println("---------------------------------------------------------------------");
		Company.printEmployee(employees, true);
		
	
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		//객체의 정보를 출력한다.(실행 결과를 참조) 
        //isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
		
		/*
		for(int i=0; i<emp.length; i++) {
			System.out.printf("%-17s%-10s%20d\n",emp[i].getName(), emp[i].getDepartment(),  emp[i].getSalary());
		}
		
		* %10s : 해당 문자열 10칸을 사용할 것, 오른쪽부터 사용
		* %-10s : 해당 문자열 10칸을 사용할 것, 왼쪽부터 사용
		*/
		
		for(Employee e : emp) {
			System.out.printf("%-8s%-10s%10d", e.getName(), e.getDepartment(), e.getSalary());
			
			if(isTax) {		//isTax가 true이면 실행하는 조건문
				System.out.printf("%10.1f", e.tax());
			}
			
			if(e instanceof Sales) {			//Employee타입의 e에 대입된 객체가 Sales인지 확인 : instanceof
				Sales s = (Sales)e;
				System.out.printf("%10.1f",s.getExtraPay());
//				System.out.printf("%10.1f",((Sales)e).getExtraPay() );
			}
			System.out.println();
		}
	}
}
