package ex02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter				//setter 생성
@Getter				//getter 생성
@NoArgsConstructor	//default생성자
@AllArgsConstructor	//모든 변수 포함된 생성

class Student2 {
	private int no;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		
		Student2 s = (Student2)obj;
		
		return this.no == s.no && this.name.equals(s.name);
	}
}

public class StudentTest02 {

	public static void main(String[] args) {
		//두 객체의 값이 동일한데, equals 사용해서 비교하면 다르다고 나옴 => equals() 메소드 오버라이딩
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(1, "홍길동");
		
		System.out.println(student1.equals(student2));
	}

}
