package ex06;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
class Num2 {
	private int num;
	
	public Num2(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return num + "";		//num은 int이기에 "" null 값 더해서 문자로 만들어서 return
	}
	
	@Override
	public int hashCode() {
		System.out.println("-hashCode-");	//hashCode 중복검사하는지 출력하여 확인용
		return num%5;			
		
		/*
		 * %5
		 * 해시 값이 5개의 구간으로 나누어지는 것
		 * 결과 값을 0에서 4 사이로 제한하여, 5개의 버킷(혹은 슬롯)으로 나누어 저장
		 * %5 없어도 동작O, 해시 코드의 범위 너무 넓어져서 비효율적
		 */
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("-equals-");		//equals 중복검사하는지 출력하여 확인용
		Num2 n = (Num2)obj;
		return this.num == n.num;
	}
}

public class TreeSetExam {

	public static void main(String[] args) {
		//data값 정렬하여 출력 : TreeSet
		Set<Integer> set = new TreeSet<>();
		
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(10);
		set.add(40);
		
		for(Integer n : set)
			System.out.println(n);
		
		System.out.println();
		
		//문자열 정렬(대문자-소문자 순서)
		Set<String> set2 = new TreeSet<>();
		
		set2.add("Toy");
		set2.add("Robot");
		set2.add("Box");
		set2.add("Toy");
		set2.add("toy");
		
		for(String n : set2)
			System.out.println(n);
		
		/*
		 * 내가 정의한 객체(new Num(1234))를 TreeSet으로 결과 확인해야 하는 경우
		 * 정렬 기준이 없기 때문에 Comparable과 compareTo()메소드 사용하여 정렬기준 만들어야 실행O
		 */
		
	}

}
