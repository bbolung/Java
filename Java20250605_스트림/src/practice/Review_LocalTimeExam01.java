package practice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Review_LocalTimeExam01 {
	
	public static void main(String[] args) {
		
		//Asia 시간대 목록 출력
		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(s -> s.startsWith("Asia"))
			.sorted()
			.forEach(zoneId -> System.out.println(zoneId));
		
		System.out.println("----------------------------------");
		
		//Seoul 시간대의 현재 날짜와 시간 구하기
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(seoulDateTime);		//2025-06-05T16:27:00.939333600+09:00[Asia/Seoul]
		System.out.println("seoul 현재 날짜와 시간: " + formatter.format(seoulDateTime));	//2025-06-05 16:27:00
		
	}
}
