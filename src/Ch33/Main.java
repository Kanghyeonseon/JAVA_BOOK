package Ch33;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		
		//----------------------------------------중요!
		Map<String, Service> map = new HashMap();
		
		   //키는 StringType, Service 객체!!!!
		
		map.put("도서관리", new BookService());
						//Srvice의 하위객체인 BookService
		map.put("회원관리", new MemberService());
						//Service의 하위객체인 MemberService
		//----------------------------------------중요!
		
		
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 도서관리");
			System.out.println("2. 회원관리");
			System.out.printf("번호 >> ");
			num = sc.nextInt();
			switch(num) {
				case 1 :
					System.out.printf("번호(1. 등록, 2. 수정, 3. 삭제) ");
					num=sc.nextInt();
					Service bs = map.get("도서관리");
					if(num ==1 ) {
						bs.Insert();
					} else if (num==2) {
						bs.Update();
					} else if (num==3) bs.Delete();
					break;
				case 2 : 

					
			}
			
					
		
		
		}
		
		
		
		
		
		
	}
}
