package Ch32;
import java.util.*;
public class C07MapMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //업캐스팅
		//key와 value형태로 제네릭타입을 제공해야한다.
		
		//추가하기
		if(!map.containsKey("idA")) {
			map.put("idA", 1234);
		}
		if(!map.containsKey("idB")) {
			map.put("idB", 1234);
		}
		if(!map.containsKey("idC")) {
			map.put("idC", 1224);
		}
		if(!map.containsKey("idD")) {
			map.put("idD", 1244); //중복된 ID가 들어오면 기본값으로 저장한다.
		}
		map.put("idC", 9999); //저장은 이게 된다.
		
		//개수 확인
		System.out.println(map.size());
		//Returns the number of key-value mappings in this map.
		//키 밸류의 수를 리턴
		
		//조회하기
		Set<String> set = map.keySet(); //모든 키 수집
		Iterator<String> iter = set.iterator();
		//이터레이터로 키 순회이므로 키의 타입과 같은걸로 순회
		
		while(iter.hasNext()) {			
			String key = iter.next();
			int value = map.get(key);
			//int가 아니라 Integer인데 int로 자동형변환되므로 상관없다.
			System.out.println("KEY : " + key + ", VALUE : " + value);
		}
	}
}
