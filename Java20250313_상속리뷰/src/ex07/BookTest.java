package ex07;

/*
 * Book 클래스의 객체(인스턴스)를 5개 생성하고 각각 변수에 
저장한 후 각각의 책 정보를 행 단위로 출력하는 BookTest 
클래스를 만든다. (아규먼트를 받지않는 생성자가 호출될 땐 
“자바의 정석” 정보로 Book 객체의 정보를 초기화 하며, 다
른 Book 객체들은 호출되는 생성자를 통해서 책 정보를 전달
하면서 객체를 생성한다. 책 정보는 임의로 정한다.)
 */

public class BookTest {

	public static void main(String[] args) {
		
		/*
		 * int[] numArr = new int[5]; 	-> numArr의 객체 5개 생성
		   numArr[0] = 10;		-> 이렇게 값 대
		   numArr[1] = 20;
		 */
		
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[1] = new Book("이것이 자바다", "신용권", 38000);
		books[2] = new Book("열혈JAVA", "윤성우", 35000);
		books[3] = new Book("HTML", "깍두기", 18000);
		books[4] = new Book("JS", "js", 28000);
		
//		System.out.println(books[0].getBookInfo()); -> 하나씩 출력O
		for(int i=0; i<books.length; i++)
			System.out.println(books[i].getBookInfo());
			
		//Book book1 = new Book(); 이렇게 작성하지 않고 배열 사용?
		
		
		
	}

}
