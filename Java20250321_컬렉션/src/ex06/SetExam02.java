package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Num {
	private int num;
	
	public Num(int num) {
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
		Num n = (Num)obj;
		return this.num == n.num;
	}
}

public class SetExam02 {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<Num>();
		
		//중복된 값 출력X
		set.add(new Num(1234));
		set.add(new Num(1357));
		set.add(new Num(1395));
		set.add(new Num(1234));
		set.add(new Num(1357));
		
		for(Num n : set)
			System.out.println(n);
		
	}

}
