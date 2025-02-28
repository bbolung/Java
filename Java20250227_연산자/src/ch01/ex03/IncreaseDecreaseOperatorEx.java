package ch01.ex03;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println();
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println();
		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println();
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println();
		
		z = ++z + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
	}

}
