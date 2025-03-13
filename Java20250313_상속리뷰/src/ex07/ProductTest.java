package ex07;

/*
 * 5개의 원소를 갖는 Product 타입의 배열을 생성한 후에Product 객체를 5개 
생성하여 각각의 원소로 대입하고 Product 객체들의 각 정보들을 행 단위로 
출력한다.(상품명   재고량   가격)–가격은 천단위로 , 를 붙이고 금액 끝에 
‘원’도 붙여서 출력한다.
 */

public class ProductTest {

	public static void main(String[] args) {
			Product[] product = new Product[5];
			
			product[0] = new Product();
			product[1] = new Product("상품1", 10, 1000);
			product[2] = new Product("상품2", 7, 2000);
			product[3] = new Product("상품3", 5, 3000);
			product[4] = new Product("상품4", 2, 4000);
			
			for(int i=0; i<product.length; i++) {
				System.out.println(product[i]);
			}
			
	}

}
