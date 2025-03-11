package ch01.ex02;

/*
 * Person 클래스
 * 사람 특징 : name, age, height, weight ...
 * 사람 동작 : run, sleep, eat, study, work ...
 * 
 * 많은 특징과 동작에서 간추려 내는 과정 = 추상화
 * class 생성 = 자료를 하나 만든다.
 */

public class Person {		//접근제한자 public -> 다른 package에서 접근O(Person p = new Person();)
	
	private String name;
	private int age;
	
	public void run() {		//접근제한자 public -> 다른 package에서 접근O(p.run();)
		System.out.println("run.........");
	}
	
	public void eat() {
		System.out.println("eat.........");
	}

}
