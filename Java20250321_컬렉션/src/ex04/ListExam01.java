package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		list.add(0, "Robot");  	//List의 메소드 오버라이딩, 0번째 자리에 "Robot" 대입
		
		System.out.println("--------for문 출력--------");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println("------향상된 for문 출력------");
		for(String str : list)
			System.out.println(str);
		
		//List, Set, Map 사용할 때 출력하려면 for문 대신 모두 출력O => 코드 최소화하기 위해서 사용
		System.out.println("----------반복자----------");
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------주어진 객체 삭제------");
		list.remove(0);		//0번지 삭제 -> 나머지 인덱스들이 앞으로 이동
		list.remove("Box");
		
		for(String str : list)
			System.out.println(str);
		
	}

}
