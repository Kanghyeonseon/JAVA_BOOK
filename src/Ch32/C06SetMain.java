package Ch32;
import java.util.*; //난수만들기도 유틸에 들어있다.
public class C06SetMain {
	public static void main(String[] args) {
		//로또만들기
		//set을 이용해서 6자리 난수를 넣어줍니다.
		//1-45까지입니다.
		//저장된 난수는 정렬 상관 없습니다.
		Random rand = new Random();
		Set<Integer> set = new HashSet();

		while(set.size()<6) {
			set.add(rand.nextInt(45)+1);
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}
		System.out.println();
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		Collections.sort(list,Collections.reverseOrder());
		for(int num : list) {
			System.out.print(num + " ");
		}
		
	}
}


	
		
		
	
