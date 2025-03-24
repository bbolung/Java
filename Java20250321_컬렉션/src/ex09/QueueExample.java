package ex09;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

class Coin2{
	private int value;
	
	public Coin2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);		//정수를 문자로 바꿔줌
	}
}

public class QueueExample {

	public static void main(String[] args) {
		//Queue는 interface이기에 객체생성X -> Queue가 구현한 클래스로 객체생성해야 함(document 참고)
		Queue<Coin2> coinBox = new ArrayDeque<>();
		
		coinBox.add(new Coin2(100));
		coinBox.add(new Coin2(50));
		coinBox.add(new Coin2(500));
		coinBox.add(new Coin2(10));
		
		System.out.println(coinBox.peek()); 	//제일 위에 있는 것 출력
		
		Iterator<Coin2> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println("꺼내온 동전: " + itr.next() + "원");
		}
	}

}
