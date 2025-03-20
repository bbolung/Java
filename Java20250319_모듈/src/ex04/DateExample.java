package ex04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//현재 날짜 및 시간 정보 전달(KST : 한국 시간)
		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		//'년.월.일 시:분:초' 형식
		//월, 시 : 반드시 대문자!
		//순서 : 현재 시간 -> 형식 정하기 -> 해당 형식으로 현재 시간 출력
		Date now2 = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
		
		String strNow2 = sdf.format(now2);
		System.out.println(strNow2);
		
		
	}

}
