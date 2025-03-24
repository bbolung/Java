package ex07;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * 내가 정의한 객체(new Num(1234))를 TreeSet으로 결과 확인해야 하는 경우
 * 정렬 기준이 없기 때문에 Comparable과 compareTo()메소드 사용하여 정렬기준 만들어야 실행O
 */


class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " & " + age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);			
	}
	
	@Override
	public boolean equals(Object obj) {
		Person n = (Person)obj;
		return this.name.equals(n.name) && this.age == n.age;
	}
	
	//이름, 나이 둘 다 정렬 -> 이름, 나이 둘 다 동일해야 중복으로 인식
	@Override
	public int compareTo(Person o) {
		//이름 먼저 비교
		int nameCompare = this.name.compareTo(o.name);
		
		if(nameCompare != 0)
			return nameCompare;
		
		return Integer.compare(this.age, o.age);
	}
	
	/*
	 * 나이 정렬
	   @Override
		public int compareTo(Person o) {
			return Integer.compare(this.age, o.age);
		}
	 */
	/*
	 * 이름 정렬
	   @Override
		public int compareTo(Person o) {
			return this.name.compareTo(o.name);
		}
	 */
}

public class TreeSetExam02 {

	public static void main(String[] args) {
		
		Set<Person> p = new TreeSet<>();
		
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 10));
		p.add(new Person("AAA", 39));
		p.add(new Person("BBB", 10));
		p.add(new Person("DDD", 30));
		p.add(new Person("FFF", 60));
		p.add(new Person("GGG", 45));
		
		for(Person pp : p)
			System.out.println(pp);
		
	}
}