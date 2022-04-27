package Ch32;

import java.util.*;

public class C05SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		
		set.add("JAVA");
		set.add("Android");
		set.add("JSP");
		set.add("OracleDB");
		set.add("SpringFramework");		
		
		System.out.println("사이즈 : " + set.size());
		
		//조회 : set에서 어느 위치를 기준점으로 잡을 것인지를 리턴을 한다.
		Iterator<String> iter = set.iterator();
		
		//iter.hasNext() :다음 위치에 요소가 존재하는지 확인한다.
		while(iter.hasNext()) {	
								//해당위치의 요소를 꺼낸다.
			System.out.println(iter.next()); 
		}
		set.remove("JAVA"); //삭제
		set.clear(); //전체 삭제
	}
}
