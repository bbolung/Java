package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Review_MyFirstStream {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6};
		
		int oddTotal = Arrays.stream(arr1).filter(n -> n%2 == 1).sum();
		
		System.out.println("홀수의 합: " + oddTotal);
		
		long oddCount = Arrays.stream(arr1).filter(n -> n%3 == 0).count();
		
		System.out.println("3의 배수의 개수: " + oddCount);
		
		System.out.print("arr1 배열 요소: ");
		Arrays.stream(arr1).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		String[] arr2 = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		System.out.print("arr2 문자열 길이값(for문): ");
		for(String str : arr2) {
			System.out.print(str.length() + " ");
		}
		
		System.out.println();
		System.out.print("arr2 문자열 길이값(Stream API): ");
		
		Arrays.stream(arr2)
			.map(n -> n.length())
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		int total = Arrays.stream(arr2)
						.mapToInt(n -> n.length())
						.sum();
		
		System.out.println("arr2 문자열 길이 합계: " + total);
		
		System.out.println("---------------------------------------------");
		
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
		
		System.out.print("list 문자열 길이: ");
		list.stream().map(n -> n.length()).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		int count = list.stream().mapToInt(n -> n.length()).sum();
		
		System.out.println("list 문자열 길이의 합계: " + count);
		
		System.out.println("---------------------------------------------");
		
		List<ToyPriceInfo> list2 = new ArrayList<ToyPriceInfo>();
		
		list2.add(new ToyPriceInfo("GUN", 2000));
		list2.add(new ToyPriceInfo("CAR", 5000));
		list2.add(new ToyPriceInfo("TEDDY", 3000));
		list2.add(new ToyPriceInfo("SHIP", 7000));
		
		System.out.print("가격: ");
		
		list2.stream()
			.mapToInt(i -> i.getPrice())
			.sorted()
			.forEach(n -> System.out.print(n + "원" + " "));
		
		System.out.println();
		
		int sum = list2.stream()
				.mapToInt(price -> price.getPrice())
				.sum();
		
		System.out.println("가격의 합계: " + sum + "원");
		
		System.out.println();
		
		int total2 = list2.stream()
						.filter(price -> price.getPrice()>= 5000)
						.mapToInt(price -> price.getPrice())
						.sum();
		
		System.out.println("5000원 이상 가격의 합계: " + total2 + "원");
		
		System.out.print("5000원 이상의 상품명: ");
		
		list2.stream()
			.filter(price -> price.getPrice()>=5000)
			.forEach(p -> System.out.print(p.getModel() + " "));
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		List<String> list3 = Arrays.asList("alice", "bob", "charlie");
		System.out.println("list3 요소: " + list3);
		
		System.out.print("list2 대문자로 출력: ");
		
		list3.stream()
			.map(str -> str.toUpperCase())
			.forEach(str -> System.out.print(str + " "));
		
		System.out.println();
		
		List<String> upperCaseNames = list.stream()
										.map(str -> str.toUpperCase())
										.collect(Collectors.toList());
		
		System.out.println("대문자로 변환된 리스트: " + upperCaseNames);
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("arr 배열: " + arr.toString());
		
		System.out.print("arr의 짝수 요소: ");
		Arrays.stream(arr).filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		List<Integer> iList = Arrays.stream(arr)
								.filter(n -> n%2 == 0)
								.boxed()
								.toList();
		
		System.out.println("arr의 짝수 요소 list: " + iList);
		
		List<Integer> iList2 = Arrays.stream(arr)
									.filter(n -> n%2 == 0)
									.boxed()
									.collect(Collectors.toList());
		
		System.out.println("arr의 짝수 요소 list(수정O): " + iList2);
		
		iList2.add(10);		//값 10 추가
		iList2.add(100);
		iList2.remove(0);	//인덱스 0 삭제(값X)
		
		System.out.println("arr의 짝수 요소 수정 list: " + iList2);
		
		System.out.println("---------------------------------------------");
		
		
	}
}
