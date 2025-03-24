package ex08;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//키가 같은 경우 제일 마지막에 저장한 값으로 저장됨(Key가 중복여부 기준)
		map.put("홍길동", 85);
		map.put("박길동", 90);
		map.put("김길동", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();
		
		//키를 반복하여 출력 -> Set 컬렉션으로 변경 후 반복자를 통해서 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyItr = keySet.iterator();
		
		while(keyItr.hasNext()) {
			String k = keyItr.next();
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
	}

}
