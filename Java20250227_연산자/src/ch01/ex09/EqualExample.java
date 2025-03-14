package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		String str1 = "korea"; 	//heap 메모리에 "korea" 생성
		String str2 = "korea";	//이미 heap 메모리에 "korea" 생성되어 있으니 기존 "korea" 사용 => 동일
		
		System.out.println(num1 == num2);
//		System.out.println(str1 == str2); => 문자열에는 동등(==) 연산자 사용X
		System.out.println(str1.equals(str2)); // => 문자열 비교 : equals() / !equals()
		
		String str3 = new String("korea");
		String str4 = new String("korea"); 	//new String => 기존에 생성되어 있어도 새로 생성 => 다름
		
		System.out.println(str3);
		System.out.println(str4);
//		System.out.println(str3 == str4); => 같은 문자여도 false 나옴 => 동등(==) 연산자 사용X
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str4));
		
		//논리 연산자
		System.out.println(5>2 && 3>1);
		System.out.println(5>2 && 3<1);
		System.out.println();
		System.out.println(	(5>2) ^ (3>1)	); 	//둘이 똑같이 true => false
		System.out.println(	(5>2) ^ (3<1)	);	//하나만 false => true
		System.out.println(	(5<2) ^ (3>1)	);	//하나만 false => true
		System.out.println(	(5<2) ^ (3<1)	);	//둘이 똑같이 false => false
		
	}

}
