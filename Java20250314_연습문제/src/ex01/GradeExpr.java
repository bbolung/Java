package ex01;

public class GradeExpr {
	private int[] jumsu;
	
	GradeExpr() {}
	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	
	double getAverage() {
		return (double)getTotal()/jumsu.length;		//getTotal() : 메소드 호출, 변수 둘 다 정수이기에 double로 강제변환
	}
	
	int getGoodScore() {
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
		return max;
	}
	
	int getBadScore() {
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min;
	}
	
	
}
