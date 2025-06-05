package ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		System.out.println("list요소: " + list);
		
		//대문자로 출력
		System.out.print("대문자로 list요소 출력: ");
		
		list.stream()
		.map(str-> str.toUpperCase())  //대문자 변환
		.forEach(n-> System.out.print(n + " "));
		
		System.out.println();
		
		//대문자로 변환된 데이타를 리스트로 저장
		List<String> upperCaseNames = list.stream()
									.map(str->str.toUpperCase())
									.collect(Collectors.toList()); 	//수집하여 List로 모음
//									.toList();
		
//		upperCaseNames.add("FFFF");
		System.out.println("대문자로 변환된 리스트: " + upperCaseNames);
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("arr 배열: " + arr);
//		System.out.println(arr.toString());  -> arr 출력과 동일
		
		System.out.print("arr의 짝수 요소: ");
		Arrays.stream(arr) 		//1,2,3,4,5,6,7,8
		.filter(n-> n%2==0)		//2,4,6,8
		.forEach(n->System.out.print(n + " "));		//2 4 6 8
		
		System.out.println();
	    
		List<Integer> iList= Arrays.stream(arr) 
		.filter(n-> n%2==0)		//2,4,6,8
		.boxed()				//int -> Integer (boxing) : 리스트는 객체만 가능하기에 기본 자료형(int) 사용X
		.toList();		 //Arrays.asList(), collect(Collectors.toList())
		System.out.println("iList: " + iList);
		
		/*
		 * toList(): 수정X (불변 리스트)
		 * .collect(Collectors.toList()): 수정O
		 * 
		 	iList.add(10);
			iList.remove(0);
			System.out.println(iList);
		 */
		

		List<Integer> iList2 = Arrays.stream(arr) 
				.filter(n-> n%2==0)
				.boxed()
				.collect(Collectors.toList());	
		System.out.println("iList2: " + iList2);
		
		iList2.add(10);
		iList2.add(100);
		iList2.remove(0);
		System.out.println("최종 iList2: " + iList2);
		
		
	}

}