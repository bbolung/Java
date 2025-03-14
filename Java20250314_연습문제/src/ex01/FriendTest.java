package ex01;

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] friend = new Friend[5];
		
		friend[0] = new Friend("이름1", "1111", "e1@mail.com");
		friend[1] = new Friend("이름2", "2222", "e2@mail.com");
		friend[2] = new Friend("이름3", "3333", "e3@mail.com");
		friend[3] = new Friend("이름4", "4444", "e4@mail.com");
		friend[4] = new Friend("이름5", "5555", "e5@mail.com");
		
		System.out.println("이름\t전화번호\t메일주소");
		System.out.println("--------------------------------");
		for(int i=0; i<friend.length; i++) {
			System.out.println(friend[i].getInfo());
		}
	}

}
