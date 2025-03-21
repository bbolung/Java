package ex05;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;

@AllArgsConstructor		//모든 변수 갖는 생성자 생성
class Member {
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Member [name = " + name + ", age = " + age + "]";
	}
	
	//중복체크 필요 -> hashCode, equals 메소드 오버라이딩O
	//hashCode가 다르면 equals 실행 안하고 저장 => 모두 출력됨
	//hashCode가 같으면 equals 메소드로 비교
	@Override
	public int hashCode() {
		System.out.println("--------------hashCode--------------");
		
		//hashCode 확인용
		int result = name.hashCode()+age;
		System.out.println("hashCode : " + result);
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("---------------equals---------------");
		Member m = (Member)obj;
		return this.name.equals(m.name) && this.age == m.age;
	}
}

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		//hashCode와 equals 사용하지 않으면 각각 저장 -> 모두 출력
		//메소드 실행 -> 같은 경우 하나만 저장 -> 하나만 출력
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",10));
		
		for(Member m : set)
			System.out.println(m);
	}

}
