package ex04;

import java.util.ArrayList;
import java.util.List;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDy", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		//전체 가격 정렬하여 출력(sorted: 문자 인식 못하기에 정수형 변환 필수)
		System.out.print("가격: ");
		
		list.stream()
			.mapToInt(i -> i.getPrice())
			.sorted()
			.forEach(n -> System.out.print(n + "원" + " "));
		
		System.out.println();
		
		//가격 합 출력
		int sum = list.stream()
				.mapToInt(price->price.getPrice())
				.sum();
		
		/*
		 * 람다식 사용하지 않은 익명클래스 코드
		 * ToIntFunction<T>: 함수형 인터페이스, T 타입 받아서 int로 바꿈
		 
		   int sum = list.stream()
                     .mapToInt(new ToIntFunction<ToyPriceInfo>() {
                     	@Override
                        public int applyAsInt(ToyPriceInfo price) {
                            return price.getPrice();
                        }
                      })
                      .sum();
		 */
		
		System.out.println("가격의 총합: " + sum + "원");
		
		
		//가격 5000이상만 출력
		int total = list.stream()
					.filter(price-> price.getPrice()>=5000)
					.mapToInt(price->price.getPrice())
					.sum();
		
		System.out.println("5000원 이상 가격의 합: " + total + "원");
		
		//가격 5000이상의 상품명 출력
		System.out.print("5000원 이상의 상품명: ");
		
		list.stream()
			.filter(price -> price.getPrice()>=5000)
			.forEach(p -> System.out.print(p.getModel() + " "));
		
		
	}

}