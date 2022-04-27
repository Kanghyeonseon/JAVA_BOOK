package Ch32;
import java.util.*;
public class C02ArrayList {
	public static void main(String[] args) {		 
		int num = 0;
		List<String> list = new ArrayList<>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 종료");
			System.out.println("5 모든 이름 보기");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();			
			switch(num)
			{
			case 1:
				System.out.print("이름을 입력하세요.");
				String A = sc.next();				
				list.add(A);				
				break;
			case 2:
				System.out.print("이름을 입력하세요.");
				String B = sc.next();

				if(list.contains(B)) {
						System.out.println("있다.");
					} else System.out.println("없다.");
		
				break;
			case 3:
				System.out.print("이름을 입력하세요.");
				String C = sc.next();				
					if(list.contains(C)) {
						list.remove(C);
						System.out.println("삭제 완료");
					} else System.out.println("삭제 실패");
				break;
			case 4:
				System.exit(-1);
			case 5:
				for (String temp : list) {
					System.out.println(temp);
				}
				break;
			default:
				System.out.println("다시 입력...");
				sc.close();
			}
		}		
	}	
}
