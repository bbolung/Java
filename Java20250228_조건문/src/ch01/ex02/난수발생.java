package ch01.ex02;

public class 난수발생 {

	public static void main(String[] args) {
		// Math. : 수학관련

		System.out.println( Math.random() );  //0.0 ~ 1.0 사이의 double타입 난수
		System.out.println( (int)(Math.random()*6) );  //0 ~ 5 사이의 난수
		System.out.println( (int)(Math.random()*6)+1 );  //1 ~ 6 사이의 난수
		
		System.out.println(Math.PI);  //Pi 값
		System.out.println(Math.abs(-1));  //절대값
		System.out.println(Math.sqrt(4));  //루트
		System.out.println(Math.sqrt(9));
		
		System.out.println(Math.floor(12.91));  //소수점 이하 절삭
		
		
	}

}
