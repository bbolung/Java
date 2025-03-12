package ch06.ex07;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean() {}
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void displayInfo() {
		System.out.println("nation: " + nation);
		System.out.println("name: " + name);
		System.out.println("ssn: " + ssn);
	}
}
