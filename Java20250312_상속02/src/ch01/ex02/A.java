package ch01.ex02;

public class A {
	private String name;	
	
	A() {}
	A(String name) {this.name = name;}
	
	//@override 입력X
	void test() {
		System.out.println("A class");
	}
	
	void funcA() {
		System.out.println("funcA()");
	}
}

class B extends A {
	private String address;
	
	B() {}
	B(String name, String address) {
		super(name);
		this.address = address;
	}
	
	@Override
	void test() {		//메소드 오버라이딩 : 메소드명이 다른 클래스의 메소드명과 동일
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funcB()");
	}
}

class C extends B {
	private int age;
	
	C() {}
	C(String name, String address, int age) {
		super(name, address);
		this.age = age;
	}
	
	@Override
	void test() {
		System.out.println("C class");
	}
	
	void funcC() {
		System.out.println("funcC()");
	}
}