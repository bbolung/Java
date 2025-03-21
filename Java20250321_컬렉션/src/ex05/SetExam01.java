package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");		//중복X -> 출력X
		
		System.out.println("------향상된 for문 출력------");
		for(String str : list)
			System.out.println(str);
		
		System.out.println("----------반복자----------");
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
