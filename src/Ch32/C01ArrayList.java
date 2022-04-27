package Ch32;

import java.util.*;

public class C01ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		//제네릭타입으로 String지정, 하위클래스인 ArrayList지정 .업캐스팅
		
		ArrayList<String> list2 = new ArrayList(); 
		//노캐스팅인이런식으로 해도된다.
		
		//import 자바유틸을 해줘야한다.
		
		//추가
		list.add("JAVA");
		list.add("JDBC");
		list.add("OracleDB");
		list.add("JSP");
		list.add("Servlet");
		list.add("SpringFramework");
		list.add("JAVA"); //중복을 허용한다.
		
		//개수확인
		System.out.println("총 개체 수 : " + list.size());	
		//2번째 인덱스 문자열 확인
		System.out.println("idx 2 번째 문자열 : " + list.get(2));
		//전체출력
		System.out.println("기본 포문---------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("개량 포문---------------------");
		for(String temp : list) {
			//list에 있는 데이터를 temp에 잠깐 저장했다가 출력한다.
			System.out.println(temp);
		}
		
		//삭제1.
		list.remove(0);
		//삭제2.
		list.remove("JSP");
		
		//리스트에 문자열을 저장하게 되면 요소를 toString으로 불러올 수 있다.
		System.out.println(list.toString());
		
		//전체삭제
		list.clear();	
	}
}
