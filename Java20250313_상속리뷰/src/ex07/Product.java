package ex07;

import java.text.DecimalFormat;

public class Product {
	private String name;
	private int balance;
	private int price;
	
	Product() {
		this("듀크인형", 5, 10000);
	}
	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");	//챗gpt의 도움
		return name + "  " + balance + "  " + formatter.format(price) + "원";
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
}
