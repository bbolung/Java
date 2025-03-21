package ex02;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//list에 값 추가 : add()
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		//출력 : for문 - get() 메소드 사용
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		//향상된 for문 사용해서 출력O
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
		//부분삭제 : remove()
		list.remove(0);		//0번지 삭제 -> 나머지 인덱스들이 앞으로 이동
		System.out.println(list.get(0));	//0번째로 Box가 이동한 것을 알 수O
		System.out.println(list.get(1));	
//		System.out.println(list.get(2));	-> 값X => Error 발생	
		System.out.println();
		
		//all 삭제
		list.clear();
//		System.out.println(list.get(0));	-> 값X => Error 발생
		
	}

}
