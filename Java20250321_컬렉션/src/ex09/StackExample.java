package ex09;

import java.util.Iterator;
import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
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

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.peek()); 	//제일 위에 있는 것 출력
		
		//저장 순서대로 꺼내줌
		Iterator<Coin> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println("꺼내온 동전: " + itr.next() + "원");
		}
		System.out.println();
		
		//동전 위에서부터 꺼내기
		System.out.println("-stack 위에서부터 꺼내기-");
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();		//위에서부터 하나씩 꺼냄
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}

}
