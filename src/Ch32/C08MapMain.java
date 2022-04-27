package Ch32;

import java.util.*;

public class C08MapMain {

	public static void main(String[] args) {
	
		int num = 0;
		String ID = null; int PW = 0;
		//Map 만들기
		Map<String,Integer> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 Password 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 전체조회");
			System.out.println("6 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			
			//전체조회를 위해 넣었음
			Set<String> set = map.keySet(); //맵에있는 모든 키를 넘겨준다.
			Iterator<String> iter = set.iterator(); //키의 위치를 넘겨준다.
			//모든 키를 수집했다.
			
			switch(num)
			{
			case 1:
				//map 에 ID/PW등록
				//단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
				System.out.printf("★ ID 입력 >>");
				ID = sc.next();
				if(!map.containsKey(ID)) { 
					System.out.printf("★ PW 입력 >>");
					PW = sc.nextInt();
					map.put(ID, PW); }
				else { System.out.println("★ 중복 ID가 존재합니다."); }
				break;
			case 2:
				//ID를 받아서 map에 있는 동일한 Id/pw 를 출력
				System.out.printf("★ 출력할 할ID >>");
				String IDgive = sc.next();	
				int value = map.get(IDgive);
				if(value==0) { System.out.println("해당 아이디는 존재하지 않습니다."); }
				else { System.out.println("★ ID : " + IDgive + " PW : " + value); }
				
				break;
			case 3:
				//ID를 받아서 map에 있는 동일한 id의 password를 변경 	
				System.out.printf("★변경할 할ID >>");
				String IDchange = sc.next();
				System.out.printf("★변경할 할PW >>");
				int PWchange = sc.nextInt();
				if(map.containsKey(IDchange)){
					map.put(IDchange, PWchange);
				} else System.out.println("★ ID를 잘못입력하셨습니다.");
				break;
			case 4:
				//ID를 받아서 map에 있는 동일한 id/pw를 삭제
				System.out.printf("★ 삭제 할ID >>");
				String IDremove = sc.next();
					if(map.containsKey(IDremove)){
						//존재하지도 않는 아이디를 삭제하면 안 된다.
						map.remove(IDremove);
						System.out.println("★ 삭제 완료!");} 
					else System.out.println("★ ID를 잘못입력하셨습니다.");
				break;
			case 5:
				//전체조회
				System.out.println("★ ID\tPW");
				while(iter.hasNext()) { 
					String key = iter.next();
					value = map.get(key); 
					//이런식으로 변수 하나하나 다시 선언하지 않고 ID랑 PW선언해놓은것을 써도된다.
					System.out.printf("★ %s\t%d\n",key,value);
				}
				break;
			case 6:
				System.exit(-1);
			default:
				System.out.println("★ 다시 입력...");
			}		
		}		
	}
}
