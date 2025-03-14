package ex01;

public class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human() {}
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//탭 : "/t"
	public String printInformation() {
		return name + "\t" + age + "\t" + height + "\t" + weight;
	}
	
	//printInformation() 메소드보다 toString 더 많이 사용
	public String toString() {
		return name + "\t" + age + "\t" + height + "\t" + weight;
	}
}
